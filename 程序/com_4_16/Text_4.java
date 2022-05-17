package com_4_16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Text_4 {
	    public static void main(String[] args){
	        try {
	        @SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("D:\\..\\春江花月夜.txt");
	        @SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream("D:\\..\\春江花月夜1.txt");
	        int len=0;
	        //一次读取多少字节的文件,这里可以选择tmp.txt的所有字节长度
	        byte[] b = new byte[fis.available()];    
	        while((len=fis.read(b))!=-1){
	             //对字节进行排序
	             Arrays.sort(b);
	             fos.write(b,0,len);
	             fos.flush();              
	        }     
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        }catch(IOException e){
	            e.printStackTrace();
	        }
	    }
	}
