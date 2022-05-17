package com_3_26;

import java.util.Random;
import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in) ;//输入,从键盘接收对象
		Random ra = new Random();//产生随机数
		int n,m;
		int rulst;
		int in_rulst;
		int temp;
		Boolean b;
		for (int i = 0;i < 10;i++){//循环10次,10个式子
			n =ra.nextInt(101);
			m =ra.nextInt(101);
			b =ra.nextBoolean();
			if(b==true){
				System.out.println(n+"+"+m+"=?");
				in_rulst=sc.nextInt();//输入结果
				rulst=n+m;//答案
			}else{
				if(n<m){
					temp=n;
					n=m;
					m=temp;//互换位置					
				}
				System.out.println(n+"-"+m+"=?");
				in_rulst=sc.nextInt();//输入结果
				rulst=n-m;//答案
			}
			if(in_rulst==rulst){
				System.out.println("你真棒,恭喜你做对了");
			}else{
				System.out.println("真遗憾,你做错了");
			}
		}
		
		
	}

}
