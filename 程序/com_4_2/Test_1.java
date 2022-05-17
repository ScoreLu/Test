package com_4_2;
//java虚拟机里，他认为一个浮点数或者双精度数
//try...catch语句，防止异常发生的时候，程序中断
public class Test_1 {

	public static void main(String[] args) {
		System.out.println("1.0/0="+(1/0));
		System.out.println("-1.0/0="+(1/0));
	try{
		System.out.println("1/0="+(1/0));
	}catch(ArithmeticException e){
		System.out.println("这是一个算术异常！"+e.getMessage());
	}
	System.out.println("这是程序的结束");
	}

}
