package com_5_22;

/**
 * ������ABͨ��һ���˻�A�ڹ�̨ȡǮ��B��ATM��ȡǮ
 * */
public class Text02 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// ʵ���������ˣ�����ͬһ�����еĶ���
		Person01 a = new Person01(bank, "Counter");
		Person02 b = new Person02(bank, "ATM");
		a.start();
		b.start();
	}

}