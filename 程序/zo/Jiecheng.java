package zo;

import java.util.Scanner;

public class Jiecheng {
    private static Scanner in;
	//�õݹ�ʵ�ֽ׳�
    public static long jieCheng(int num)
    {
        if(num==1) //��1�Ľ׳�
        {
            return 1;
        }
        else
        {
            //ת��Ϊn*(n-1)!
             //����Ϊ0��returnֵΪn*(n-1)*factorial(n-1-1),ֱ��n=0����������
            return num*jieCheng(num-1);
        }
    }

    public static void main(String[] args) {
        int k;
        in = new Scanner(System.in);
        String x=in.next();
		try
		{
		k=Integer.parseInt(x, 16);//������Ĳ���ǿתΪint��
		System.out.println(k);
		}
		catch(Exception e)//try{}�зŵ�����Ҫ���еĴ���
		//catch(Exception e){}�зŵ���������д�������쳣 Ҫִ�еĲ���
		{
			e.printStackTrace();//printStackTrace()��������˼�ǣ��������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
			System.out.println(x+"����һ����Ч��ʮ��������");
			k=0;
		}
        System.out.println("������һ����������");
        k = in.nextInt();
        System.out.println("k�Ľ׳��ǣ�"+jieCheng(k));
    }
}
