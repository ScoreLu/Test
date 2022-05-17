package com_4_2;
//异常的抛出，系统自动抛出的，我们自己抛出的
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
		throw new Exception("分数应该在0-100之间");
	}
	System.out.println("您的分数是"+s);	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
