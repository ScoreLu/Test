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
					System.out.println("恭喜猜对,一共猜了" + str(icount) + "次");
					game=false;
				}else if(a>num){
					System.out.println("输入数据过大");
					 icount = icount + 1  ;
				}else{
					System.out.println("输入数据过小");
					 icount = icount + 1  ;
				}
			}
		}

		private static int str(int icount) {

			return icount;
		}
}