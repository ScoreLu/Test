package ao;

import java.util.Scanner;

public class Disiti {
		public static void main(String[] args){
			int num=(int)(Math.random()*100+1);
			boolean game=true;
			int icount = 1;
			while(game){
				@SuppressWarnings("resource")
				int a=new Scanner(System.in).nextInt();
				if(a==num){
					System.out.println("��ϲ�¶�,һ������" + str(icount) + "��");
					game=false;
				}else if(a>num){
					System.out.println("�������ݹ���");
					 icount = icount + 1  ;
				}else{
					System.out.println("�������ݹ�С");
					 icount = icount + 1  ;
				}
			}
		}

		private static int str(int icount) {

			return icount;
		}
}