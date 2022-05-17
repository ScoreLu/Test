package com_10_14;
public class Text {	
public static void main(String[] args)throws Exception {
	HyString s1=new HyString("liulubin07");
	  HyString s2=new HyString("ruanjian06");
	  int a=s1.length();                                                      
	  IString s3=s1.insert(3,s2);           
	  IString s4=s3.substring(3,6);         
	  s1.countDigital();                    
	  s2.countAlpha();                      
	  System.out.println(a);                
	  System.out.println(s3.length());      
	  s3.display();
	  s4.display();                         
	   
	  }  
	 

}
