package com_4_26;

import java.util.Scanner;

public class Dazhe {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("���ۿ�ʼ");
		// ����۸�  
		System.out.println("�����뵥�ۣ�");
		int carprices = scan.nextInt();
		System.out.println("������ۣ�");
		int zhekou = scan.nextInt();
		// sum�����洢һ����Ǯ��
		int sum = carprices * zhekou;
		System.out.println("���ۺ��ǮΪ��" + sum + ",�ۿ�Ϊ��" + zhekou);
	}
}
