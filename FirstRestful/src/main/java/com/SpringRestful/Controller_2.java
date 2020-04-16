package com.SpringRestful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("advertise")
public class Controller_2 {

	public static List<Advertisement> adList=new ArrayList<Advertisement>();
	public static Map<String,ArrayList<Advertisement>> UserAd=new HashMap<String,ArrayList<Advertisement>>();
	
	static {
		adList.add(new Advertisement("a1", "Open", "laptop sale", "Hemant", "Hardware", "lenovo ideapad"));
		adList.add(new Advertisement("a2", "Closed", "game sale", "Priyamvad", "Software", "The Witcher"));
	}
	
	@GetMapping(value="/advertise",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> ReadCategory() {
		List<String> categories=adList.stream().map(Advertisement::getCategory).collect(Collectors.toList());
		return categories;
	}
	
	@PostMapping(value="/adverises",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertisement PostNewAd(@RequestBody Advertisement ad,@RequestHeader(name="auth-token") String authToken) {
		if (Controller.loggedUser.containsKey(authToken)==true && UserAd.containsKey(authToken)==false) {
			adList.add(ad);
			ArrayList<Advertisement> newAd=new ArrayList<Advertisement>();
			newAd.add(ad);
			UserAd.put(authToken, newAd);
			return ad;
		}
		else if(Controller.loggedUser.containsKey(authToken)==true && UserAd.containsKey(authToken)==true) {
			adList.add(ad);
			ArrayList<Advertisement> sample=UserAd.get(authToken);
			sample.add(ad);
			System.out.println(UserAd);
			return ad;
		}
		
		else
			return null;
	}
	/*
	@PutMapping(value="/advertise/{id}",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Advertisement UpdateAdvertisement(@RequestBody Advertisement ad,@PathVariable(name="id") String orderId,@RequestHeader(name="auth-token") String authToken) {
		
	}
	*/
}
