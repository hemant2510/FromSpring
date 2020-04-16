package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Json.Message;
import com.spring.entity.AdvertisementEntity;
import com.spring.entity.MessageEntity;
import com.spring.entity.UserEntity;
import com.spring.rest.repository.AdvertisementRepository;
import com.spring.rest.repository.MessageRepository;
import com.spring.utils.MessageUtils;

@Service
public class MessageServiceImplementation implements MessageService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdvertisementRepository adRepository;
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Message sendMessage(Message message, String postId, String authToken) {
		UserEntity userEntity = userService.isValidToken(authToken);
		if(userEntity!=null) {
			AdvertisementEntity advertisementEntity = adRepository.findByPostId(postId).get(0);
			MessageEntity messageEntity = MessageUtils.convertMessageToMessageEntity(message);
			messageEntity.setAdvertisementEntity(advertisementEntity);
			messageEntity.setUserEntity(userEntity);
			return MessageUtils.convertMessageEntityToMessage(messageRepository.save(messageEntity));
		}
		return null;
	}

	
}
