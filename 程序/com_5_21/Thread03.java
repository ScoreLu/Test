package com_5_21;

public class Thread03 extends Thread {

	public  void run() {
	System.out.println(Thread.currentThread().getName()+"run()�Ŀ�ʼ��");
	try{
		Thread.sleep(10000);
		System.out.println("���߽�����");
	}catch(InterruptedException e){
		System.out.println("��·�ж�");
		e.printStackTrace();
	}
	System.out.println("����������");
	}
}
