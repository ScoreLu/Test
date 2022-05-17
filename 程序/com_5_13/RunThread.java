package com_5_13;


public class RunThread {
    public static void main(String[] args) throws InterruptedException {
        LowThread thread1Run=new LowThread();   //新建RUnnable对象
        Thread thread1=new Thread(thread1Run,"线程1");//使用Runnable对象初始化Thread
        thread1.start();     //线程启动，自动执行run()方法
 
        LowThread thread2Run=new LowThread();
        Thread thread2=new Thread(thread2Run,"线程2");
        thread2.start();
        
        LowThread thread3Run=new LowThread();
        Thread thread3=new Thread(thread3Run,"线程3");
        thread3.start();              
        
        Thread.sleep(50); //主线程休眠让出处理器，让thread1和2使用处理器执行
 
        System.out.println("高级线程切入");
        thread1Run.runFlag=false;       //在线程外通过volatile变量控制低级线程停止
        thread2Run.runFlag=false;
        thread3Run.runFlag=false;
        HighThread highThread=new HighThread();
        highThread.setName("高级别线程");
        highThread.start();
        highThread.join();          //让其他线程等待直到高级线程执行结束，否则会先执行主线程，输出下一句
        System.out.println("主线程执行结束");
    }
}
