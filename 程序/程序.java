import java.util.Random;
import java.util.Scanner;
public class Test{
 	public static void main(String[] args){   
		Scanner scan = new Scanner(System.in);
                System.out.print("������һ��1~100֮���������");
		int b =(int) (Math.random()*100+1); 	    
while(true){
System.out.print("�����룺");
Scanner objScanner = new Scanner(System.in);
int a = objScanner.nextInt();
if(a == b){
System.out.println("��������¶��ˣ�");
break;
}else if(a > b){
System.out.println("���ź�,��µ����ִ������������룺");
}else{
System.out.println("���ź�,��µ�����С�����������룺");
}
if(a == b){
System.out.println("��ϲ��¶���������־��ǣ�");
}
a++;
}
}
} 