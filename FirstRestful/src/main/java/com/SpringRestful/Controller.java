package com.SpringRestful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class Controller {

		public static List<User> userList=new ArrayList<User>();
		public static Map<String,User> loggedUser=new HashMap<String,User>();
		
		static {
			userList.add(new User("Hemant","Raj","hemantraj","hemant","hemant.desire91@gmail.com",7978227));
			userList.add(new User("Priyamvad","Singh","priyamvadsingh","priyamvad","priyamvad123@gmail.com",2222223));
			
			}
		
		@PostMapping(value="/user", consumes=MediaType.APPLICATION_JSON_VALUE , produces=MediaType.APPLICATION_JSON_VALUE)
			public String userLogin(@RequestBody User user) {
			String userName=user.getUserName();
			final String password=user.getPassword();
			
			if (userList.stream().anyMatch((User newUser)-> newUser.getUserName().equals(userName) && newUser.getPassword().equals(password))==true) {
				List<User> logger=userList.stream().filter((User newUser)-> newUser.getUserName().equals(userName) && newUser.getPassword().equals(password)).collect(Collectors.toList());
				loggedUser.put("a1",logger.get(0));
				System.out.println(loggedUser);
				return "User Login Successful";
			}
			
			else {
				return "Invalid Credentials";
			}
		}
		
		@DeleteMapping(value="/user/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
		public String LogoutByUsername(@PathVariable(name="id") String username,@RequestHeader(name="auth-token") String authToken) {
			if (loggedUser.containsKey(authToken)) {
				loggedUser.remove(authToken);
				return ("User has been Logged Out");
			}
			
			else {
				return "Invalid authentication";
			}
		}
			
		
}

