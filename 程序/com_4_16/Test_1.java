package com_4_16;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �и�������nΪż��,����a��ÿ��Ԫ�ض�Ҫ���±�,����,a��ÿ��Ԫ�ض�Ҫ��ȥ�±�,���Ҫ�������Ԫ��
 */

public class Test_1 {
	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ����");

		int n = sc.nextInt();
			// ���ԴӼ�������
        int[]a=new int[8];
        Arrays.fill(a, 8);
        if(n%2==0){
        for(int i=0;i<a.length;i++){
        	a[i]=a[i]+i;
        }
        }else{
        	for(int i=0;i<a.length;i++){
            	a[i]=a[i]-i;

        }
	}
        boolean b=display(a);
        System.out.println(b);
	}
	public static boolean display(int[]array){
		System.out.println("����������Ԫ��!");
		for(int i:array){
		System.out.print(i+"");
		}
	System.out.println();
	return true;
}
}
