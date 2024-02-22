package com.ruby.java.ch08.innerClass;

interface Messenger {
	String getMessage();
	
	void setMessage(String msg);
}

public class MessengerTest {
	public static void main(String[] args) {
		GalaxyMessenger galaxy = new GalaxyMessenger();
		Messenger test = new Messenger() { //익명클래스
			public String getMessage() {
				return "test";
			}
			public void setMessage(String msg) {
			System.out.println("메시지 = : " + msg);	
		}
	};
}
}

