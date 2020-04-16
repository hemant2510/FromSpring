package com.spring.service;

import com.spring.Json.Message;

public interface MessageService {

	public Message sendMessage(Message message, String postId, String authToken);
}
