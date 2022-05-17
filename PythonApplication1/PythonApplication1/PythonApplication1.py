import datetime
import numpy as np
import pandas as pd
import lightgbm as lgb
from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score,f1_score
import matplotlib.pyplot as plt 
from hyperopt import fmin,hp,Trials,space_eval,rand,tpe,anneal
import warnings 
warnings.filterwarnings('ignore')

def printlog(info):
    nowtime = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
    print("\n"+"=========="*8 + "%s"%nowtime)
    print(info+'...\n\n')

#================================================================================
# 一，读取数据
#================================================================================
printlog("step1: reading data...")

# 读取dftrain,dftest
breast = datasets.load_breast_cancer()
df = pd.DataFrame(breast.data,columns = [x.replace(' ','_') for x in breast.feature_names])
df['label'] = breast.target
df['mean_radius'] = df['mean_radius'].apply(lambda x:int(x))
df['mean_texture'] = df['mean_texture'].apply(lambda x:int(x))
dftrain,dftest = train_test_split(df)

categorical_features = ['mean_radius','mean_texture']
lgb_train = lgb.Dataset(dftrain.drop(['label'],axis = 1),label=dftrain['label'],
                        categorical_feature = categorical_features,free_raw_data=False)

lgb_valid = lgb.Dataset(dftest.drop(['label'],axis = 1),label=dftest['label'],
                        categorical_feature = categorical_features,
                        reference=lgb_train,free_raw_data=False)

#================================================================================
# 二，搜索超参
#================================================================================
printlog("step2: searching parameters...")

boost_round = 10                   
early_stop_rounds = 5

params = {
    'learning_rate': 0.1,
    'boosting_type': 'gbdt',#'dart','rf'  
    'objective':'binary',
    'metric': ['auc'],
    'num_leaves': 31,
    'max_depth':  6,
    'min_data_in_leaf': 5,  
    'min_gain_to_split': 0,
    'reg_alpha':0,
    'reg_lambda':0,
    'feature_fraction': 0.9,
    'bagging_fraction': 0.8,
    'bagging_freq': 5,
    'feature_pre_filter':False,
    'verbose': -1
}

# 1，定义目标函数
def loss(config):
    params.update(config)
    gbm = lgb.train(params,
                    lgb_train,
                    num_boost_round= boost_round,
                    valid_sets=(lgb_valid, lgb_train),
                    valid_names=('validate','train'),
                    early_stopping_rounds = early_stop_rounds,
                    verbose_eval = False)
    y_pred_test = gbm.predict(dftest.drop('label',axis = 1), num_iteration=gbm.best_iteration)
    val_score = f1_score(dftest['label'],y_pred_test>0.5)

    return -val_score

  
# 2，定义超参空间

#可以根据需要，注释掉偏后的一些不太重要的超参
spaces = {"learning_rate":hp.loguniform("learning_rate",np.log(0.001),np.log(0.5)),
          "boosting_type":hp.choice("boosting_type",['gbdt','dart','rf']),
          "num_leaves":hp.choice("num_leaves",range(15,128)),
          #"max_depth":hp.choice("max_depth",range(3,11)),
          #"min_data_in_leaf":hp.choice("min_data_in_leaf",range(1,50)),
          #"min_gain_to_split":hp.uniform("min_gain_to_split",0.0,1.0),
          #"reg_alpha": hp.uniform("reg_alpha", 0, 2),
          #"reg_lambda": hp.uniform("reg_lambda", 0, 2),
          #"feature_fraction":hp.uniform("feature_fraction",0.5,1.0),
          #"bagging_fraction":hp.uniform("bagging_fraction",0.5,1.0),
          #"bagging_freq":hp.choice("bagging_freq",range(1,20))
          }


# 3，执行超参搜索
# hyperopt支持如下搜索算法
#随机搜索(hyperopt.rand.suggest)
#模拟退火(hyperopt.anneal.suggest)
#TPE算法（hyperopt.tpe.suggest，算法全称为Tree-structured Parzen Estimator Approach）

trials = Trials()
best = fmin(fn=loss, space=spaces, algo= tpe.suggest, max_evals=100, trials=trials)
   
# 4，获取最优参数
best_params = space_eval(spaces,best)
print("best_params = ",best_params)


# 5，绘制搜索过程
losses = [x["result"]["loss"] for x in trials.trials]
minlosses = [np.min(losses[0:i+1]) for i in range(len(losses))] 
steps = range(len(losses))

fig,ax = plt.subplots(figsize=(6,3.7),dpi=144)
ax.scatter(x = steps, y = losses, alpha = 0.3)
ax.plot(steps,minlosses,color = "red",axes = ax)
plt.xlabel("step")
plt.ylabel("loss")


#================================================================================
# 三，训练模型
#================================================================================
printlog("step3: training model...")

params.update(best_params)
results = {}
gbm = lgb.train(params,
                lgb_train,
                num_boost_round= boost_round,
                valid_sets=(lgb_valid, lgb_train),
                valid_names=('validate','train'),
                early_stopping_rounds = early_stop_rounds,
                evals_result= results,
                verbose_eval = True)

#================================================================================
# 四，评估模型
#================================================================================
printlog("step4: evaluating model ...")

y_pred_train = gbm.predict(dftrain.drop('label',axis = 1), num_iteration=gbm.best_iteration)
y_pred_test = gbm.predict(dftest.drop('label',axis = 1), num_iteration=gbm.best_iteration)

train_score = f1_score(dftrain['label'],y_pred_train>0.5)
val_score = f1_score(dftest['label'],y_pred_test>0.5)

print('train f1_score: {:.5} '.format(train_score))
print('valid f1_score: {:.5} \n'.format(val_score))

fig2,ax2 = plt.subplots(figsize=(6,3.7),dpi=144)
fig3,ax3 = plt.subplots(figsize=(6,3.7),dpi=144)
lgb.plot_metric(results,ax = ax2)
lgb.plot_importance(gbm,importance_type = "gain",ax=ax3)

#================================================================================
# 五，保存模型
#================================================================================
printlog("step5: saving model ...")


model_dir = "gbm.model"
print("model_dir: %s"%model_dir)
gbm.save_model("gbm.model",num_iteration=gbm.best_iteration)
printlog("task end...")


