package com_3_26;
import java.util.Scanner;
public class Test { 		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		  String str1 = "3.5 , 4.2 , 5.6 , ";
		     Scanner ss = new Scanner(str1).useDelimiter("\\ss*,\\ss*");
		     System.out.println(ss.next());
		     System.out.println(ss.next());
		     System.out.println(ss.next());
			ss.close();
			double a = 3.5;
			double b = 4.2;
			double c = 5.6;
		   double p = (a+b+c)/2;			 
		   double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));//Math.sqrt()��һ���Ǹ�ʵ����ƽ��������
			 if (a+b>c && b+c>a && a+c>b){ //�Ƿ�Ϊ������ 
			 System.out.println(s);      
			 }else{           
			System.out.println("������������");     
			}  
			 }
		 }
