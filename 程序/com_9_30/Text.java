package com_9_30;

import java.util.Scanner;

public class Text {
	 public static void main(String[ ] args)throws Exception{
		   SqStack s=new SqStack(20);
		   menu();
		   @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		   while(true) {
			   int a=sc.nextInt();
			   if(a==0)
				   break;
			   else
			   s.push(a);
		   }
		   System.out.println("退出成功");
		   while(true) {
			   int b=sc.nextInt();
			   if(b==1) {
				System.out.println("顺序栈的长度为"+s.length());  
			   }			   
			   if(b==2) {
				   System.out.println("请输入元素");
				   int c=sc.nextInt();
				   s.push(c);
				   System.out.println(c+"入栈成功");
			   }
			   if(b==3) {
				   s.pop();
			   }
			   if(b==4) {
				   s.display();
			   }
			   if(b==0)
				   break;
		   }
	   }
	   public static void menu(){
		   System.out.println("1.长度");
		   System.out.println("2.入栈");
		   System.out.println("3.出栈");
		   System.out.println("4.打印栈");
		   System.out.println("0.退出");
		   System.out.println("-------------");
		   System.out.println("作者：刘璐宾         班级：软工六班");
		   System.out.println("请输入操作代码（0-退出）");
		   System.out.println("请输入一组数执行入栈操作（输入0结束）");
	   }
}
