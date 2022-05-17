package com_5_13;

public class LowThread implements Runnable {//通过实现接口来新建线程类
    volatile boolean runFlag = true;     //通过标记来控制循环的执行
    @Override
    public void run() {
        int count = 6;
        String threadName=Thread.currentThread().getName();
        while (runFlag) {
            System.out.println(threadName + "线程循环次数：" + count);
            Thread.yield();             //每循环一次让出处理器，重新和其他线程竞争处理器
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName+"执行结束");
    }
}

