package com_5_13;

public class LowThread implements Runnable {//ͨ��ʵ�ֽӿ����½��߳���
    volatile boolean runFlag = true;     //ͨ�����������ѭ����ִ��
    @Override
    public void run() {
        int count = 6;
        String threadName=Thread.currentThread().getName();
        while (runFlag) {
            System.out.println(threadName + "�߳�ѭ��������" + count);
            Thread.yield();             //ÿѭ��һ���ó������������º������߳̾���������
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName+"ִ�н���");
    }
}

