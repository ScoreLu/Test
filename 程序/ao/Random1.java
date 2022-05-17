package ao;
public class Random1 {
	    public static void main(String[] args)
	    {
	        int i=1;
	        while(i<=10)
	        {
	            char c=(char)('A'+Math.random()*('Z'-'A'+1));
	            System.out.println(c);
	            i++;
	        }    
	    }
	}