package com_3_26;

import java.util.Random;
import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in) ;//����,�Ӽ��̽��ն���
		Random ra = new Random();//���������
		int n,m;
		int rulst;
		int in_rulst;
		int temp;
		Boolean b;
		for (int i = 0;i < 10;i++){//ѭ��10��,10��ʽ��
			n =ra.nextInt(101);
			m =ra.nextInt(101);
			b =ra.nextBoolean();
			if(b==true){
				System.out.println(n+"+"+m+"=?");
				in_rulst=sc.nextInt();//������
				rulst=n+m;//��
			}else{
				if(n<m){
					temp=n;
					n=m;
					m=temp;//����λ��					
				}
				System.out.println(n+"-"+m+"=?");
				in_rulst=sc.nextInt();//������
				rulst=n-m;//��
			}
			if(in_rulst==rulst){
				System.out.println("�����,��ϲ��������");
			}else{
				System.out.println("���ź�,��������");
			}
		}
		
		
	}

}
