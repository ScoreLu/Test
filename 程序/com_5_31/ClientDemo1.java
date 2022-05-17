package com_5_31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
	public static void main(String[] args) throws IOException{
		//1.创建客户端的套接字
		Socket s=new Socket("localhost",10086);
		//2.获取输出流
		//第一层.字符缓冲输出流
		//第二层.字符转换输出流
		//第三层.字符输出流
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//3.获取输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String userName=sc.nextLine();
		System.out.println("请输入密码");
		String password=sc.nextLine();
		//4.写数据
		bw.write(userName);
		bw.newLine();
		bw.write(password);
		bw.flush();
		//bw.close();//切记，缓冲流写数据。需要刷空！！！
		
		//告诉服务器，客户端这边数据写入完毕
		s.shutdownOutput();
		//5.读取从服务器响应的数据
		String info=br.readLine();//阻塞式方式
		System.out.println(info);
		//6.关闭套接字
		s.close();
	}

}
