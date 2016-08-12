package com.spring.test;

public class Message {
	private String Message;

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	@SuppressWarnings("unused")
	private void printMessage(){
		System.out.println("Message:"+this.Message);
	}
}
