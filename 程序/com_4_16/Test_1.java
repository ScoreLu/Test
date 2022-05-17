package com_4_16;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 有个数若数n为偶数,数组a中每个元素都要加下标,否则,a中每个元素都要减去下标,最后要输出数组元素
 */

public class Test_1 {
	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个数");

		int n = sc.nextInt();
			// 可以从键盘输入
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
		System.out.println("以下是数字元素!");
		for(int i:array){
		System.out.print(i+"");
		}
	System.out.println();
	return true;
}
}
