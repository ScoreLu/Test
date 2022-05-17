package com_5_31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class ServerDemo1 {

	public static Map<String,String>getUserInfo() throws FileNotFoundException,IOException{
	Properties p=new Properties();
	p.load(new FileInputStream("user.properties"));
    String userName= p.getProperty("userName");
    String password= p.getProperty("password");
    Map<String,String>map=new HashMap<>();
    map.put("userName", userName);
    map.put("password", password);
	
    return map;
	}
	public static void main(String[] args) throws IOException{
		        //1.创建服务器的套接字
				@SuppressWarnings("resource")
				ServerSocket ss=new ServerSocket(10086);
				//2.监听客户端的套接字
				Socket s=ss.accept();
				//3.获取输出流
				//第一层.字符缓冲输出流
				//第二层.字符转换输出流
				//第三层.字符输入流
				
				BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//4.获取输出流
			
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				//5.读取数据
				@SuppressWarnings({ "unused", "resource" })
				Scanner sc=new Scanner(System.in);	
				String userName=br.readLine();	
				String password=br.readLine();
				//6.判断用户名和密码
				//获取判断用户名和密码
				Map<String,String>map=getUserInfo();
				System.out.println(userName);
				System.out.println("-----------------------");
				
				if(map.get("userName").equals(userName)&&map.get("password").equals(password)){
				//需要将响应返回客户端
			    //System.out.println("登陆成功");
					bw.write("登陆成功");
					bw.flush();
				}else{
					bw.write("登陆失败");
					bw.flush();
				}
				//7.关闭客户端套接字
				s.close();
				}
}

