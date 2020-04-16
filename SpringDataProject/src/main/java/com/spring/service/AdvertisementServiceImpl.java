package com.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Json.Advertisement;
import com.spring.entity.AdvertisementEntity;
import com.spring.entity.UserEntity;
import com.spring.rest.repository.AdvertisementRepository;
import com.spring.utils.AdvertisementUtils;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	private AdvertisementRepository adRepository;
	
	@Autowired
	private UserService userService;
	
	@Override
	public List<String> getCategories() {
		List<AdvertisementEntity> advertisementEntity = adRepository.findAll();
		return advertisementEntity.stream().map(AdvertisementEntity::getCategory).collect(Collectors.toList());
	}

	@Override
	public Advertisement saveAdvertisement(Advertisement advertisement,String authToken) {
			UserEntity userEntity = userService.isValidToken(authToken);
			System.out.println(userEntity);
			AdvertisementEntity advertisementEntity=AdvertisementUtils.convertAdvertisementToAdvertisementEntity(advertisement);
			advertisementEntity.setUserEntity(userEntity);
			AdvertisementEntity advertisementEntity1 = adRepository.save(advertisementEntity);
			return  AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity1);
	}

	@Override
	public Advertisement updateAdvertisement(Advertisement advertisement, String authToken) {
		UserEntity userEntity = userService.isValidToken(authToken);
		if(userEntity!=null) {
			AdvertisementEntity advertisementEntity=AdvertisementUtils.convertAdvertisementToAdvertisementEntity(advertisement);
			advertisementEntity.setUserEntity(userEntity);
			AdvertisementEntity advertisementEntity1 = adRepository.save(advertisementEntity);			return  AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity1);
		}
		else {
			return null;
		}
	}

	@Override
	public List<Advertisement> getAdvertisements(String authToken) {
		UserEntity userEntity = userService.isValidToken(authToken);
		if(userEntity!=null) {
			Set<AdvertisementEntity> advertisementEntity= userEntity.getAdvertisementEntity();
			
			List<AdvertisementEntity> ad = new ArrayList<AdvertisementEntity>();
			ad.addAll(advertisementEntity);
			
			return AdvertisementUtils.convertAdvertisementEntityListToAdvertisementList(ad);
		}
		return null;
	}

	@Override
	public Advertisement getAdvertisementByPostID(String postId,String authToken) {
		
		UserEntity userEntity = userService.isValidToken(authToken);
		if(userEntity!=null) {
			AdvertisementEntity advertisementEntity = adRepository.findByPostId(postId).get(0);
			return AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity);
	}
		return null;

	
	
	}

	@Override
	public String deleteAdevertisementByPostID(String postId, String authToken) {
		UserEntity userEntity = userService.isValidToken(authToken);
		if(userEntity!=null) {
			AdvertisementEntity advertisementEntity = adRepository.findByPostId(postId).get(0);
			adRepository.delete(advertisementEntity);
			return "Advertisement deleted successfully";
		}
		return "Invalid Session ID";
	}

	@Override
	public Advertisement searchByText(String searchText) {
		List<AdvertisementEntity> advertisementEntity=adRepository.findAll();
		List<AdvertisementEntity> advertisementEntity1= advertisementEntity.stream().filter(a->a.getDescription().contains(searchText)).collect(Collectors.toList());
		return AdvertisementUtils.convertAdvertisementEntityToAdvertisement(advertisementEntity1.get(0));
	}
}
