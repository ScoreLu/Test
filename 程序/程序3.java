import java.io.*; 
public class Ko {		
	public static void main(String[] args)throws IOException{		
		System.out.print("Enter a Char:");   		
		char c = (char) System.in.read();       
		if((c=='A')||(c=='a'))        
		System.out.println("该成绩91-100分优秀");     
		else if((c=='B')||(c=='b'))     
		System.out.println("该成绩71-90分良好");  
		else if((c=='C')||(c=='c'))        
		System.out.println("该成绩60-70分中等");    
		else if((c=='D')||(c=='d'))        	
		System.out.println("该成绩60分以下不及格");       
		else        	System.out.println("考试成绩为：50，评定为：不及格");	
		} 
		}

