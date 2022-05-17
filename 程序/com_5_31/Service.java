package com_5_31;

public class Service {
	public static void main(String[] args) {
		new Thread(new Receive(8888, "¿Í»§")).start();
		new Thread(new Send(6666, "localhost", 7777)).start();
	}
}
