package com_5_21;

public class Thread01 extends Thread {
   private String name;
   public Thread01(String name){
	this.name=name;
}
	public  void run() {//�߳�����
		System.out.println(name+"��ʼ��");
	for(int i=0;i<10;i++){
		System.out.println(name+"����.i="+i);	
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	System.out.println(name+"������");

	}

}
