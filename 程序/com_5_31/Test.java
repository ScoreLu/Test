package com_5_31;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
	try{
		InetAddress ids=InetAddress.getLocalHost();
		System.out.println(ids.getHostAddress());
		System.out.println(ids.getHostName());
		
	}catch(UnknownHostException e){
		e.printStackTrace();
	}

	}

}
