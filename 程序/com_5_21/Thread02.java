package com_5_21;

public abstract  class Thread02 implements Runnable {
	 private int ticket=20; 
//	public String name;   
//	public Thread02(String name) {
//		this.name=name;
//	}
	public void run() {
		for(int i=0;i<20;i++){
//		synchronized (this) {
		if(ticket>0){
				try{
					Thread.sleep(300);
				}catch(InterruptedException e){
			e.printStackTrace();
			}
	System.out.println(Thread.currentThread().getName()+"卖出第"+"ticket"+"张。");
	ticket--;
			
		}
		
//		for(int i=0;i<10;i++){
//			System.out.println(Thread.currentThread().getName()+name+"运行.i="+i);
		}
	}
}

