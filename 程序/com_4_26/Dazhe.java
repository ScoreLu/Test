package com_4_26;

import java.util.Scanner;

public class Dazhe {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("打折开始");
		// 输入价格  
		System.out.println("请输入单价：");
		int carprices = scan.nextInt();
		System.out.println("输入打几折：");
		int zhekou = scan.nextInt();
		// sum用来存储一共的钱数
		int sum = carprices * zhekou;
		System.out.println("打折后价钱为：" + sum + ",折扣为：" + zhekou);
	}
}
