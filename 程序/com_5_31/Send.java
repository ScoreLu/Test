package com_5_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Send implements Runnable {
	private DatagramSocket client;// ���Ͷ�
	BufferedReader br; // ������
	private String toIp;// ����Ŀ��ip
	private int toPort;// ����Ŀ��˿� �ͽ��ն�ʹ�ö˿�һ��
	public Send(int port, String toIp, int toPort) {
		this.toIp = toIp;
		this.toPort = toPort;
		try {
			client = new DatagramSocket(port);
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while (true) {
			try {
				// 2��׼������ һ��ת���ֽ�����
				String data = br.readLine();
				byte[] datas = data.getBytes();
				// 3����װ��DatagramPacket ��������Ҫָ����ַ
				DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
						new InetSocketAddress(this.toIp, this.toPort));
				// 4�����Ͱ���
				client.send(packet);
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 5���ͷ���Դ
		client.close();
	}
}
