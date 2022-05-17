package com_3_26;
public class Test_4 {
public static void main(String[] args) {
int[] balls = new int[33];//创建一个int类型的一维数组balls，用来保存33个彩球的编号
            for(int i=0;i<33;i++){//生成的6个红球号码不重复数字大小在（01-33）之间
            balls[i]=i+1;
            }
            int[] arr=new int[7];   //存放机选号码的数组
            int j=0;
            boolean[] flags = new boolean[33];//创建一个boolean类型的一维数组flags，用来保存33个红球的状态，默认全部为false
            int index;//产生的随机数使用index变量保存
            for(int i=0;i<6;i++){//需要取6次红球（循环次数已知，可以使用for循环实现）
                do{
                    index = (int)(Math.random()*33+1);
                    if(flags[index]==false){
                        // System.out.print(balls[index]+"  ");     //红球
                    	arr[j++]=balls[index];
                        flags[index]=true;//意味着编号等于balls[index]的这个彩球已经被取出来了
                        break;
                  }
                }while(flags[index]); 
                
            }
            arr[6]=(int)(Math.random()*16+1);// 蓝球直接生成一个1-16的整数存放于arr[6]；
         
         System.out.println("机选号码为： ");
         for(int e:arr){
            System.out.print(e+" ");
         }
   }
}
