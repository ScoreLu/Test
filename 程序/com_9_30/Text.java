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
		   System.out.println("�˳��ɹ�");
		   while(true) {
			   int b=sc.nextInt();
			   if(b==1) {
				System.out.println("˳��ջ�ĳ���Ϊ"+s.length());  
			   }			   
			   if(b==2) {
				   System.out.println("������Ԫ��");
				   int c=sc.nextInt();
				   s.push(c);
				   System.out.println(c+"��ջ�ɹ�");
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
		   System.out.println("1.����");
		   System.out.println("2.��ջ");
		   System.out.println("3.��ջ");
		   System.out.println("4.��ӡջ");
		   System.out.println("0.�˳�");
		   System.out.println("-------------");
		   System.out.println("���ߣ���贱�         �༶��������");
		   System.out.println("������������루0-�˳���");
		   System.out.println("������һ����ִ����ջ����������0������");
	   }
}
