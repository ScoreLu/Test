package zo;
import java.util.*;
public class Jinzhi {
		@SuppressWarnings("resource")
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("ʮ������תʮ�������㣬������һ��ʮ��������:");
			String x=in.next();
			int n;
			try
			{
			n=Integer.parseInt(x, 16);//������Ĳ���ǿתΪint��
			System.out.println(n);
			}
			catch(Exception e)//try{}�зŵ�����Ҫ���еĴ���
			//catch(Exception e){}�зŵ���������д�������쳣 Ҫִ�еĲ���
			{
				e.printStackTrace();//printStackTrace()��������˼�ǣ��������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
				System.out.println(x+"����һ����Ч��ʮ��������");
				n=0;
			}
			System.out.println("����");
		}
	}
