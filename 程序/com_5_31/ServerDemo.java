package com_5_31;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		// 1.�������������׽���
		ServerSocket ss=new ServerSocket(10089);
		//2.���ӿͻ��˵��׽��֣����ҷ��ؿͻ��˵��׽���
		Socket s=ss.accept();//����ʽ����
		//.��ȡ������
		InputStream is=s.getInputStream();
		//��ȡ����
		//byte[] by=new byte[1314];
     int num=0;
     while((num=is.read())!=-1){
    	 System.out.println((char)num);
     }
     //5.�ر��׽���
     s.close();
	}

}
