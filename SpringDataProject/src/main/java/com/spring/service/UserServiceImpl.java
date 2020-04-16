package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Json.User;
import com.spring.entity.UserEntity;
import com.spring.rest.repository.UserRepository;
import com.spring.utils.UserUtils;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		UserEntity userEntity = 
				userRepository.save(UserUtils.convertUserToUserEntity(user));
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	public String autoLogin(User user) {
		UserEntity user1=userRepository.findByUserName(user.getUserName()).get(0);
		if(user1!=null) {
			if(user1.getPassword().equals((user.getPassword()))) {
				String sessionId = new java.rmi.server.UID().toString().substring(0, 10);
				user1.setSessionID(sessionId);
				userRepository.save(user1);
				return sessionId;
			}
			else {
				return "invalid password";
			}
		}
		
		else {
			return "invalid username";
		}	
	}

	public User autoLogout(String apiKey) {
		UserEntity user1=userRepository.findBySessionID(apiKey).get(0);
		user1.setSessionID(null);
		UserEntity userEntity=userRepository.save(user1);	
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	public User getUserById(String apiKey) {
		UserEntity userEntity = userRepository.findBySessionID(apiKey).get(0);
		return UserUtils.convertUserEntityToUser(userEntity);
	}
	
	public UserEntity isValidToken(String authToken) {
		return userRepository.findBySessionID(authToken).get(0);
		
	}

}
