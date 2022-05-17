package com_4_2;
	import java.util.Scanner;	 
	public class Test_3_1 {	 
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b= sc.nextInt();
			int c = sc.nextInt();
			isTriangle(a, b, c);
		}
			public static void isTriangle(int a,int b,int c) {
				try {
					/*if((a*a+b*b)==c*c || 
							(a*a+c*c)==b*b || 
							(b*b+c*c)==a*a) {*/
					if((a+b)>c && (a+c)>b && (b+c)>a) {
						
						System.out.println(a+","+b+","+c);
					}else {
						throw new IllegalArgumentException("a,b,c不能构成三角形");
					}
					
				}catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
	}
