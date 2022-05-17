package com_4_9;


	import java.io.*;

	public class Test_3 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	String str = "Thinkgamer QQ is 1923361654";
	try{
	@SuppressWarnings("resource")
	FileWriter gyt = new FileWriter("Thinkgamer.txt");
	gyt.write(str,0,str.length());
	gyt.flush();

	@SuppressWarnings("resource")
	FileReader out = new FileReader("Thinkgamer.txt");
	int ch = 0;
	while((ch = out.read())!=-1){
	System.out.print((char)ch);
	}
	}
	catch(Exception as){
	as.printStackTrace();
	}
	}
	}
