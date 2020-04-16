package com.spring.utils;

import com.spring.Json.Advertisement;
import com.spring.Json.Message;
import com.spring.entity.AdvertisementEntity;
import com.spring.entity.MessageEntity;

public class MessageUtils {
	public static Message convertMessageEntityToMessage(MessageEntity messageEntity) {
		return new Message(messageEntity.getMessage_id(), messageEntity.getMessage());
	}

	public static MessageEntity convertMessageToMessageEntity(Message message) {
		return new MessageEntity(message.getMessage_Id(),message.getMessage());
	}

}
