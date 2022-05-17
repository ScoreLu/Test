package com_5_31;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		// 1.创建服务器的套接字
		ServerSocket ss=new ServerSocket(10089);
		//2.监视客户端的套接字，并且返回客户端的套接字
		Socket s=ss.accept();//阻塞式方法
		//.获取输入流
		InputStream is=s.getInputStream();
		//读取数据
		//byte[] by=new byte[1314];
     int num=0;
     while((num=is.read())!=-1){
    	 System.out.println((char)num);
     }
     //5.关闭套接字
     s.close();
	}

}
