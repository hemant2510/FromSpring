package com.spring.service;

import com.spring.Json.User;
import com.spring.entity.UserEntity;

public interface UserService {
	public UserEntity isValidToken(String authToken);
	public User save(User user);
	public String autoLogin(User user);
	public User autoLogout(String apiKey);
	public User getUserById(String apiKey);
}
