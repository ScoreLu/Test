package ao;
import java.util.Random;

import java.util.Scanner;

public class Disanti {
	private static Scanner scan;
		public static void main(String[] args) {
			Random rand=new Random();
			System.out.println("请开始答题");
			for (int i = 1; i <=10; i++) {
				int num=rand.nextInt(4)+1;
				scan = new Scanner(System.in);
				int a=rand.nextInt(101);
				int b=rand.nextInt(101);
				int c=a+b;
				switch (num) {//(表达式) 
				    case 1://常量表达式1: 
					System.out.println(a+"+"+b+"=?");
					System.out.println("请输入你的答案");
					int m=scan.nextInt();
					if (m==c) {
						System.out.println(""+c+"");
						System.out.println("你真棒，答对了");
					return;
						
					}else {
						System.out.println("很遗憾，你做出错了,正确答案为:"+c+"");
					}
					break;
				    
				    case 2://常量表达式2: 
					int e=rand.nextInt(101);
					int d=rand.nextInt(101);
					int f=e-d;
					System.out.println(e+"-"+d+"=?");
					System.out.println("请输入你的答案");
					int n=scan.nextInt();
					if (n==f) {
						System.out.println(""+f+"");
						System.out.println("你真棒，答对了。");
								return;
						
				}else {
					System.out.println("很遗憾，你做出错了,正确答案为:"+f+"");
					
				}
			break;
			}
			}
		}
}