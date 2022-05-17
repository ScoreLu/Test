package com_5_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

	public class Talk {
	public static void main(String[] args) {
	try {
	DatagramSocket sendSocket =new DatagramSocket();
	@SuppressWarnings({ "unused", "resource" })
	DatagramSocket receSocket =new DatagramSocket(666);
	new Thread(new Send(sendSocket)).start();
	new Thread(new Rece(sendSocket)).start();
	} catch (SocketException e) {
	e.printStackTrace();
	}
	}
	}
	//发送方法
	class Send implements Runnable{
	private DatagramSocket ds;
	public Send(DatagramSocket ds) {
	super();
	this.ds = ds;
	}
	@Override
	public void run() {
	BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in ));
	String  line=null;
	try {
	while ((line=bufr.readLine())!=null) {
	if ("233".equals(line)) {
	break;
	}
	byte[] buf=line.getBytes();
	DatagramPacket dp=new DatagramPacket
	(buf, buf.length,InetAddress.getByName("127.0.0.1"),666);
	ds.send(dp);

	}
	} catch (IOException e) {
	throw new RuntimeException("发送端失败");

	}
	}

	}
	//接收方法
	class  Rece implements Runnable{
	private DatagramSocket ds;
	public   Rece(DatagramSocket ds) {
	super();
	this.ds = ds;
	}
	@Override
	public void run() {
	try {
	while (true) {
	byte[] buf=new byte[1024];
	DatagramPacket dp=new DatagramPacket(buf, buf.length);
	ds.receive(dp);
	String ip=dp.getAddress().getHostAddress();
	String data=new String(dp.getData(), 0, dp.getLength());
	System.out.println(ip+"****"+data);

	}

	} catch (Exception e) {
	throw new RuntimeException("接收端失败");


	}
	}

	}
