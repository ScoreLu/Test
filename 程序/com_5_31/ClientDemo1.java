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
		//1.�����ͻ��˵��׽���
		Socket s=new Socket("localhost",10086);
		//2.��ȡ�����
		//��һ��.�ַ����������
		//�ڶ���.�ַ�ת�������
		//������.�ַ������
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//3.��ȡ������
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String userName=sc.nextLine();
		System.out.println("����������");
		String password=sc.nextLine();
		//4.д����
		bw.write(userName);
		bw.newLine();
		bw.write(password);
		bw.flush();
		//bw.close();//�мǣ�������д���ݡ���Ҫˢ�գ�����
		
		//���߷��������ͻ����������д�����
		s.shutdownOutput();
		//5.��ȡ�ӷ�������Ӧ������
		String info=br.readLine();//����ʽ��ʽ
		System.out.println(info);
		//6.�ر��׽���
		s.close();
	}

}
