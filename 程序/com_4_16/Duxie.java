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
	//2.����һ��InputStream�Ķ���
		FileInputStream fin=new FileInputStream(f);
	//3.����һ���ڴ������ݵ�һ������,����,�������
		byte[]buf=new byte[1024];
	//4.��¼��ǰ����ʵ�ʶ��˶��ٸ��ֽ�
		@SuppressWarnings("unused")
		int inread=0;
	//5.������fin.read();
		while((inread=fin.read(buf))!=-1){
			System.out.println(new String(buf));
		}
	//6.�ر���
		fin.close();
	}
	public static void Output(String path)throws IOException {
    FileOutputStream oup=new FileOutputStream(path);
    String str="�л����񹲺͹�����";
    oup.write(str.getBytes());
    oup.close();
}
}