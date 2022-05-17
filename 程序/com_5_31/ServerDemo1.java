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
		        //1.�������������׽���
				@SuppressWarnings("resource")
				ServerSocket ss=new ServerSocket(10086);
				//2.�����ͻ��˵��׽���
				Socket s=ss.accept();
				//3.��ȡ�����
				//��һ��.�ַ����������
				//�ڶ���.�ַ�ת�������
				//������.�ַ�������
				
				BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//4.��ȡ�����
			
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				//5.��ȡ����
				@SuppressWarnings({ "unused", "resource" })
				Scanner sc=new Scanner(System.in);	
				String userName=br.readLine();	
				String password=br.readLine();
				//6.�ж��û���������
				//��ȡ�ж��û���������
				Map<String,String>map=getUserInfo();
				System.out.println(userName);
				System.out.println("-----------------------");
				
				if(map.get("userName").equals(userName)&&map.get("password").equals(password)){
				//��Ҫ����Ӧ���ؿͻ���
			    //System.out.println("��½�ɹ�");
					bw.write("��½�ɹ�");
					bw.flush();
				}else{
					bw.write("��½ʧ��");
					bw.flush();
				}
				//7.�رտͻ����׽���
				s.close();
				}
}

