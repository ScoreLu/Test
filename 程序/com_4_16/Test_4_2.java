package com_4_16;


	 import   java.io.IOException;   
	    
	 public class Test_4_2 { 
	     
	   public   static   void   main(String[]   args)   
	   {   
	     
	   String   filepath="D:\\..\\��������ҹ.txt";   
	   Runtime   rt   =   Runtime.getRuntime();   
	   try   {   
	     
	   rt.exec("cmd   /c   del   "+filepath); 
	   System.out.println("ɾ���ɹ�");
	     
	   }   catch   (IOException   e)   {   
	    System.out.println("ɾ��ʧ��");
	   }   
	   }   
	   }   
