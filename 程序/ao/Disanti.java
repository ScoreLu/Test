package ao;
import java.util.Random;

import java.util.Scanner;

public class Disanti {
	private static Scanner scan;
		public static void main(String[] args) {
			Random rand=new Random();
			System.out.println("�뿪ʼ����");
			for (int i = 1; i <=10; i++) {
				int num=rand.nextInt(4)+1;
				scan = new Scanner(System.in);
				int a=rand.nextInt(101);
				int b=rand.nextInt(101);
				int c=a+b;
				switch (num) {//(���ʽ) 
				    case 1://�������ʽ1: 
					System.out.println(a+"+"+b+"=?");
					System.out.println("��������Ĵ�");
					int m=scan.nextInt();
					if (m==c) {
						System.out.println(""+c+"");
						System.out.println("������������");
					return;
						
					}else {
						System.out.println("���ź�������������,��ȷ��Ϊ:"+c+"");
					}
					break;
				    
				    case 2://�������ʽ2: 
					int e=rand.nextInt(101);
					int d=rand.nextInt(101);
					int f=e-d;
					System.out.println(e+"-"+d+"=?");
					System.out.println("��������Ĵ�");
					int n=scan.nextInt();
					if (n==f) {
						System.out.println(""+f+"");
						System.out.println("�����������ˡ�");
								return;
						
				}else {
					System.out.println("���ź�������������,��ȷ��Ϊ:"+f+"");
					
				}
			break;
			}
			}
		}
}