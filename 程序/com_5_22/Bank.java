package com_5_22;

import java.util.Objects;
public class Bank {
	// ����һ���˻���1000��Ǯ  
	static double money = 1000;
	// ��̨CounterȡǮ�ķ���  
	private void Counter(double money) {
		Bank.money -= money;
		System.out.println("��̨ȡǮ" + money + "Ԫ����ʣ" + Bank.money + "Ԫ��");
	}
	// ATMȡǮ�ķ���  
	private void ATM(double money) {
		Bank.money -= money;
		System.out.println("ATMȡǮ" + money + "Ԫ����ʣ" + Bank.money + "Ԫ��");
	}
	
	//�ṩһ������ȡ��;������ֱֹ�ӵ�ȡ����ͬʱȡ��ʱ�����������ʾ����
	public synchronized void outMoney(double money, String mode) throws Exception{
		if(money > Bank.money){
			//У������Ƿ����
			throw new Exception("ȡ����"+money+",���ֻʣ"+Bank.money+"��ȡ��ʧ��");
		}
		if(Objects.equals(mode, "ATM")){
			ATM(money);
		} else {
			Counter(money);
		}
	}
 
}
