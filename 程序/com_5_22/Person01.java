package com_5_22;

public class Person01 extends Thread {
 
	Bank bank;
	
	String mode;
 
	public Person01(Bank bank, String mode) {
		this.mode = mode;
		this.bank = bank;
	}
 
	@SuppressWarnings("static-access")
	public void run (){
		while(bank.money >= 100){
			try {
				bank.outMoney(100, mode);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
