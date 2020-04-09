package com.spring.service;

import com.spring.Json.User;

public interface UserService {
	public User save(User user);
	public String autoLogin(User user);
	public User autoLogout(String apiKey);
	public User getUserById(String apiKey);

}
