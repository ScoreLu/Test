package com_5_22;

/**
 * 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱
 * */
public class Text02 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// 实例化两个人，传入同一个银行的对象
		Person01 a = new Person01(bank, "Counter");
		Person02 b = new Person02(bank, "ATM");
		a.start();
		b.start();
	}

}