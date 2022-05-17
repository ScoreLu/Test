package com_5_31;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class ClientDemo {

	public static void main(String[] args) throws IOException{
		// 1.创建客户端的套接字，做链接，指定服务器ip+端口
		Socket s =new Socket(InetAddress.getLocalHost(),10086);//网络链接的过程
		//获取输出流
		OutputStream os=(OutputStream) s.getOutputStream();
		//写数据
		os.write(97);
		os.write(98);
		os.write(99);
		//关闭套接字
		os.close();
		s.close();
	}

}
