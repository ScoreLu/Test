package com_5_31;

public class Customer {
	public static void main(String[] args) {
		new Thread(new Send(9999, "localhost", 8888)).start();
		new Thread(new Receive(7777, "¿œ∞Â")).start();
	}
}
