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
			FileInputStream fis = new FileInputStream("D:\\..\\��������ҹ.txt");
	        @SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream("D:\\..\\��������ҹ1.txt");
	        int len=0;
	        //һ�ζ�ȡ�����ֽڵ��ļ�,�������ѡ��tmp.txt�������ֽڳ���
	        byte[] b = new byte[fis.available()];    
	        while((len=fis.read(b))!=-1){
	             //���ֽڽ�������
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
