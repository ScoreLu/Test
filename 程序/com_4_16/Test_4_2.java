package com_4_16;


	 import   java.io.IOException;   
	    
	 public class Test_4_2 { 
	     
	   public   static   void   main(String[]   args)   
	   {   
	     
	   String   filepath="D:\\..\\春江花月夜.txt";   
	   Runtime   rt   =   Runtime.getRuntime();   
	   try   {   
	     
	   rt.exec("cmd   /c   del   "+filepath); 
	   System.out.println("删除成功");
	     
	   }   catch   (IOException   e)   {   
	    System.out.println("删除失败");
	   }   
	   }   
	   }   
