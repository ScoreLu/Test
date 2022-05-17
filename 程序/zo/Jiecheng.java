package zo;

import java.util.Scanner;

public class Jiecheng {
    private static Scanner in;
	//用递归实现阶乘
    public static long jieCheng(int num)
    {
        if(num==1) //求1的阶乘
        {
            return 1;
        }
        else
        {
            //转换为n*(n-1)!
             //若不为0则return值为n*(n-1)*factorial(n-1-1),直到n=0，跳出函数
            return num*jieCheng(num-1);
        }
    }

    public static void main(String[] args) {
        int k;
        in = new Scanner(System.in);
        String x=in.next();
		try
		{
		k=Integer.parseInt(x, 16);//把里面的参数强转为int型
		System.out.println(k);
		}
		catch(Exception e)//try{}中放的是你要运行的代码
		//catch(Exception e){}中放的是如果运行代码出现异常 要执行的部分
		{
			e.printStackTrace();//printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。
			System.out.println(x+"不是一个有效的十六进制数");
			k=0;
		}
        System.out.println("请输入一个正整数：");
        k = in.nextInt();
        System.out.println("k的阶乘是："+jieCheng(k));
    }
}
