package com_4_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Duxie {

	public static void main(String[] args) {
	}
	public static void Input(String path)throws IOException {
    //1.
		File f=new File(path);
	//2.构建一个InputStream的对象
		FileInputStream fin=new FileInputStream(f);
	//3.构建一个内存存放数据的一个区域,变量,数组变量
		byte[]buf=new byte[1024];
	//4.记录当前数组实际读了多少个字节
		@SuppressWarnings("unused")
		int inread=0;
	//5.该数据fin.read();
		while((inread=fin.read(buf))!=-1){
			System.out.println(new String(buf));
		}
	//6.关闭流
		fin.close();
	}
	public static void Output(String path)throws IOException {
    FileOutputStream oup=new FileOutputStream(path);
    String str="中华人民共和国万岁";
    oup.write(str.getBytes());
    oup.close();
}
}