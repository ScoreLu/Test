package com_5_22;


public class Person02 extends Thread {
		Bank bank;
		
		String mode;
	 
		public Person02(Bank bank, String mode) {
			this.bank = bank;
			this.mode = mode;
		}
	 
		@SuppressWarnings("static-access")
		public void run() {
			while (bank.money >= 200) {
				try {
					bank.outMoney(200, mode);
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