package com_4_2;
//�쳣���׳���ϵͳ�Զ��׳��ģ������Լ��׳���
//throws ScoreException
//try...catch
import java.util.Scanner;
public class Test_2_1 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	double s=sc.nextDouble();
	try{
	if(s<0||s>100){
		throw new Exception("����Ӧ����0-100֮��");
	}
	System.out.println("���ķ�����"+s);	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
