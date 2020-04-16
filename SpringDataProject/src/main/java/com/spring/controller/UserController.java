package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Json.User;
import com.spring.service.UserService;

@RestController
@RequestMapping("/myapp")
public class UserController {
	
	@Autowired
	private UserService registrationService;
	
	@PostMapping(value="/user", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User registerUser(@RequestBody User user) {
		return registrationService.save(user);
	}
	
	@GetMapping(value="/user",produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@RequestHeader(name="auth-token") String authToken) {
			return registrationService.getUserById(authToken);
	}
	
	@PostMapping(value="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String loginUser(@RequestBody User user){
		return registrationService.autoLogin(user);
	}
	
	@DeleteMapping(value="/user",produces=MediaType.APPLICATION_JSON_VALUE)
	public User logoutUser(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.autoLogout(authToken);
	}

}
