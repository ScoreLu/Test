package com_5_21;

public class Text {

	public static void main(String[] args) {
		System.out.println("main线程的开始！");
		Thread01 t1 = new Thread01("A:");
		Thread01 t2 = new Thread01("B:");
		Thread01 t3 = new Thread01("C:");
//		Thread01 t4 = new Thread01("D:");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
//		try{
//			t1.join();
//		}catch(InterruptedException e){
//			e.printStackTrace();
//		}
		System.out.println("main线程的结束！");
//		Thread02 td3=new Thread02("C:");
		//td3.
//		Thread t4=new Thread(td3);
//		t4.start();
//		Thread t5=new Thread(td3);
//		t5.start();
		//new Thread(new Thread02(“D:”)).start();
	}

}
