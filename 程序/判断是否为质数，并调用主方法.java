import java.util.Scanner;
public class Ko{
	public static void main(String[] args) 
{  	  System.out.print("请输入判别的数：");
      Scanner sc = new Scanner(System.in);
	   int x = sc.nextInt();
      System.out.println(ko(x));

	          }
	public static boolean ko(int a)
{           
		int n=2;		
		while(n<a)
		{
		if(a%n==0)
		return false;
		n++;
		    }
		if(a==1)
{
		return false;
}
		return true;
}
}