import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		//��ȡ�û�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������һ��ʮ����������");
		
		//�����û��������ֵ�Ƿ����Ҫ��
		if(sc.hasNextInt()){
			int num=sc.nextInt();
			if(num>=0){
				System.out.print("ʮ����"+num+"�Ķ�����Ϊ��");
				int a=0, b=1, c;
				for(int i=1; ;i++){
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
				System.out.println("���������ֵ�������������롣");
			}
		}else{
			System.out.println("���������ֵ�������������롣");
		}
	}
}
