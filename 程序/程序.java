import java.util.Random;
import java.util.Scanner;
public class Test{
 	public static void main(String[] args){   
		Scanner scan = new Scanner(System.in);
                System.out.print("请输入一个1~100之间的整数！");
		int b =(int) (Math.random()*100+1); 	    
while(true){
System.out.print("请输入：");
Scanner objScanner = new Scanner(System.in);
int a = objScanner.nextInt();
if(a == b){
System.out.println("你真棒！猜对了！");
break;
}else if(a > b){
System.out.println("很遗憾,你猜的数字大了请重新输入：");
}else{
System.out.println("很遗憾,你猜的数字小了请重新输入：");
}
if(a == b){
System.out.println("恭喜你猜对了这个数字就是：");
}
a++;
}
}
} 