package Ko;
import java.util.Scanner;
public class zhuan{
	public static void main(String[] args){
		//获取用户输入
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请随机输入一个十进制整数：");
		
		//检验用户输入的数值是否符合要求
		if(sc.hasNextInt()){
			int num=sc.nextInt();
			if(num>=0){
				System.out.print("十进制"+num+"的二进制为：");
				int a=0, b=1, c;
				for(@SuppressWarnings("unused")
				int i=1; ;i++){
					c=num%2;
					num=num/2;
					a+=c*b;
					b*=10;
					if(num == 0){
						break;
					}
				}
				System.out.print(a);
			}else{
				System.out.println("您输入的数值有误，请重新输入。");
			}
		}else{
			System.out.println("您输入的数值有误，请重新输入。");
		}
	}
}
