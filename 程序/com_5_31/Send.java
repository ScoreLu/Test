package com_5_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Send implements Runnable {
	private DatagramSocket client;// 发送端
	BufferedReader br; // 输入流
	private String toIp;// 发送目标ip
	private int toPort;// 发送目标端口 和接收端使用端口一致
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
				// 2、准备数据 一定转成字节数组
				String data = br.readLine();
				byte[] datas = data.getBytes();
				// 3、封装成DatagramPacket 包裹，需要指定地址
				DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
						new InetSocketAddress(this.toIp, this.toPort));
				// 4、发送包裹
				client.send(packet);
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 5、释放资源
		client.close();
	}
}
