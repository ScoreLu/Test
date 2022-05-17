package com_5_13;

public class GuiTu {
    private int toristDistance;//乌龟跑过的距离
    private int rabbitDistance;//兔子跑过的距离
    /**
     * 乌龟线程内部类
     */
    class Torist extends Thread{
 
        @Override
        public void run() {
            //分析编程代码
            for(int i=1;i<=100;i++){
                //判断兔子是否到达终点
                if(rabbitDistance==100){
                    //当兔子先1000的时候 兔子就已经赢了
                    System.out.println("兔子赢得了比赛，此时乌龟才跑了"+toristDistance+"米");
                    break;
                }else{
                    //乌龟开始跑
                    toristDistance+=1;
                    //判断距离是否是100的倍数
                    if(toristDistance%100==0){
                        try {
                            System.out.println("乌龟跑过了【"+toristDistance+"】米，此时兔子跑过段距离是【"+rabbitDistance+"】");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
 
        }
    }
    /**
     * 兔子线程内部类
     */
    class Rabbit extends Thread{
 
        @Override
        public void run() {
            //分析编程代码
            for(int i=1;i<=100/5;i++){
                //判断兔子是否到达终点
                if(toristDistance==100){
                    //当兔子先1000的时候 兔子就已经赢了
                    System.out.println("乌龟赢得了比赛，此时兔子才跑了"+rabbitDistance+"米");
                    break;
                }else{
                    //乌龟开始跑
                    rabbitDistance+=5;
                    //判断距离是否是100的倍数
                    if(rabbitDistance%20==0){
                        try {
                            System.out.println("兔子跑过二段距离是【"+rabbitDistance+"】"+"乌龟跑过了【"+toristDistance+"】米，");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

