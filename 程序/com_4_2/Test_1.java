package com_4_2;
//java����������Ϊһ������������˫������
//try...catch��䣬��ֹ�쳣������ʱ�򣬳����ж�
public class Test_1 {

	public static void main(String[] args) {
		System.out.println("1.0/0="+(1/0));
		System.out.println("-1.0/0="+(1/0));
	try{
		System.out.println("1/0="+(1/0));
	}catch(ArithmeticException e){
		System.out.println("����һ�������쳣��"+e.getMessage());
	}
	System.out.println("���ǳ���Ľ���");
	}

}
