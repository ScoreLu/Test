package com_5_13;


public class RunThread {
    public static void main(String[] args) throws InterruptedException {
        LowThread thread1Run=new LowThread();   //�½�RUnnable����
        Thread thread1=new Thread(thread1Run,"�߳�1");//ʹ��Runnable�����ʼ��Thread
        thread1.start();     //�߳��������Զ�ִ��run()����
 
        LowThread thread2Run=new LowThread();
        Thread thread2=new Thread(thread2Run,"�߳�2");
        thread2.start();
        
        LowThread thread3Run=new LowThread();
        Thread thread3=new Thread(thread3Run,"�߳�3");
        thread3.start();              
        
        Thread.sleep(50); //���߳������ó�����������thread1��2ʹ�ô�����ִ��
 
        System.out.println("�߼��߳�����");
        thread1Run.runFlag=false;       //���߳���ͨ��volatile�������Ƶͼ��߳�ֹͣ
        thread2Run.runFlag=false;
        thread3Run.runFlag=false;
        HighThread highThread=new HighThread();
        highThread.setName("�߼����߳�");
        highThread.start();
        highThread.join();          //�������̵߳ȴ�ֱ���߼��߳�ִ�н������������ִ�����̣߳������һ��
        System.out.println("���߳�ִ�н���");
    }
}
