package Ko;

public class teshusiweishu {
		public static void main(String[] args)
		{
			int a, b, c, d;	
			for (int i = 1000; i <= 9999; i++) 
			{			
				a = i / 1000;		
				b = (i - a * 1000) / 100;		
				c = (i - a * 1000 - b * 100) / 10;		
				d = i % 10;			
				if (a == d && b == c) 
				{		
					
					System.out.println(i);	
					}		
				}	
			} 
		}
	
