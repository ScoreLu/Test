package com_5_31;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive implements Runnable {
	private DatagramSocket server; // ���ն�
	@SuppressWarnings("unused")
	private int port; // ���ն�ʹ�ö˿�
	private String from; // ���ͷ����
	public Receive(int port, String from) {
		this.from = from;
		try {
			server = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				// 2��׼��������װ��DatagramPacket ����
				byte[] container = new byte[1024 * 60];
				DatagramPacket packet = new DatagramPacket(container, container.length);
				// 3������ʽ���հ���
				server.receive(packet);
				// 4����������
				byte[] datas = packet.getData();
				String msg = new String(datas, 0, packet.getLength());
				System.out.println(from + ":" + msg);
				if(msg.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 5���ͷ���Դ
		server.close();
	}
}
