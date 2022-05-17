 
package ao;
public class Math1
{
public static void main(String[] args) { 
		int[] b=new int[10]; 
	  for(int i=0;i<b.length;i++){ 
		  b[i]=(int) (Math.random()*100); 	  
		  } 
		for(int i=0;i<b.length;i++){ 
			System.out.print(b[i]+"  "); 
		} 
	}
}