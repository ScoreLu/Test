package com_5_31;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class ClientDemo {

	public static void main(String[] args) throws IOException{
		// 1.�����ͻ��˵��׽��֣������ӣ�ָ��������ip+�˿�
		Socket s =new Socket(InetAddress.getLocalHost(),10086);//�������ӵĹ���
		//��ȡ�����
		OutputStream os=(OutputStream) s.getOutputStream();
		//д����
		os.write(97);
		os.write(98);
		os.write(99);
		//�ر��׽���
		os.close();
		s.close();
	}

}
