package zo;
import java.util.*;
public class Jinzhi {
		@SuppressWarnings("resource")
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("十六进制转十进制运算，请输入一个十六进制数:");
			String x=in.next();
			int n;
			try
			{
			n=Integer.parseInt(x, 16);//把里面的参数强转为int型
			System.out.println(n);
			}
			catch(Exception e)//try{}中放的是你要运行的代码
			//catch(Exception e){}中放的是如果运行代码出现异常 要执行的部分
			{
				e.printStackTrace();//printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。
				System.out.println(x+"不是一个有效的十六进制数");
				n=0;
			}
			System.out.println("结束");
		}
	}
