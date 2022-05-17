package com_5_21;

public class Thread03 extends Thread {

	public  void run() {
	System.out.println(Thread.currentThread().getName()+"run()的开始！");
	try{
		Thread.sleep(10000);
		System.out.println("休眠结束！");
	}catch(InterruptedException e){
		System.out.println("线路中断");
		e.printStackTrace();
	}
	System.out.println("正常结束！");
	}
}
