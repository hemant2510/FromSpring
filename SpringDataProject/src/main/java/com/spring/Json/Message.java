package com.spring.Json;

public class Message {
	private int message_id;
	private String message;
	
	public Message() {}
	
	public Message(int message_id, String message) {
		super();
		this.message_id = message_id;
		this.message = message;
	}
	public int getMessage_Id() {
		return message_id;
	}
	public void setId(int id) {
		this.message_id = message_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [id=" + message_id + ", message=" + message + "]";
	}
	

}
