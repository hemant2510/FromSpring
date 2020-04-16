package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Json.Advertisement;
import com.spring.Json.Message;
import com.spring.service.AdvertisementService;
import com.spring.service.MessageService;
import com.spring.service.UserService;

@RestController
@RequestMapping("/myad")
public class AdvertisementController {
	@Autowired
	private AdvertisementService advertisementService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MessageService messageService;

	@GetMapping("/category")
	public List<String> getCategories() {
		return advertisementService.getCategories();
	}
	
	@PostMapping(value="/postad", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Advertisement saveAdvertisement(@RequestBody Advertisement advertisement, @RequestHeader (name="auth-token") String authToken) {
		if(userService.isValidToken(authToken)!=null) {
			return advertisementService.saveAdvertisement(advertisement,authToken);
		}
		
		else {
			return null;
		}
	}
	
	@PutMapping(value="/updatead",produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Advertisement updateAdvertisement(@RequestBody Advertisement advertisement, @RequestHeader (name="auth-token") String authToken) {
		return advertisementService.updateAdvertisement(advertisement, authToken);
	}
	
	@GetMapping(value="/readad",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Advertisement> readAdvertisement(@RequestHeader (name="auth-token") String authToken){
		return advertisementService.getAdvertisements(authToken);
	}
	
	@GetMapping(value="/readpost/{postId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertisement getAdvertisementByPostID(@PathVariable(name="postId") String postId,@RequestHeader (name="auth-token") String authToken) {
		System.out.println(authToken);
		return advertisementService.getAdvertisementByPostID(postId, authToken);
	}
	
	@PostMapping(value="/message/{postId}",produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Message sendmessage(@RequestBody Message message, @PathVariable(name="postId") String postId, @RequestHeader (name="auth-token") String authToken) {
		return messageService.sendMessage(message, postId, authToken);
	}
	
	@GetMapping(value="/search/{searchText}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertisement searchByText(@PathVariable(name="searchText") String searchText) {
		return advertisementService.searchByText(searchText);
	}
	
	@DeleteMapping(value="delete/{postId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteAd(@PathVariable(name="postId") String postId, @RequestHeader (name="auth-token") String authToken) {
		return advertisementService.deleteAdevertisementByPostID(postId, authToken);
	}
}
