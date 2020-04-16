package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.Json.Advertisement;

public interface AdvertisementService {
	
	public List<String> getCategories();
	public Advertisement saveAdvertisement(Advertisement advertisement,String authToken);
	public Advertisement updateAdvertisement(Advertisement advertisement, String authToken);
	public List<Advertisement> getAdvertisements(String authToken);
	public Advertisement getAdvertisementByPostID(String postId,String authToken);
	public String deleteAdevertisementByPostID(String postId,String authToken);
	public Advertisement searchByText(String searchText);
}
