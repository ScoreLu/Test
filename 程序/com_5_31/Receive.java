package com_5_31;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive implements Runnable {
	private DatagramSocket server; // 接收端
	@SuppressWarnings("unused")
	private int port; // 接收端使用端口
	private String from; // 发送方标记
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
				// 2、准备容器封装成DatagramPacket 包裹
				byte[] container = new byte[1024 * 60];
				DatagramPacket packet = new DatagramPacket(container, container.length);
				// 3、阻塞式接收包裹
				server.receive(packet);
				// 4、分析数据
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
		// 5、释放资源
		server.close();
	}
}
