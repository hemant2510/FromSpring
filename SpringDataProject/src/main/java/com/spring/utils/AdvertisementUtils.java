package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.Json.Advertisement;
import com.spring.Json.User;
import com.spring.entity.AdvertisementEntity;
import com.spring.entity.UserEntity;

public class AdvertisementUtils {
	
	public static List<Advertisement> convertAdvertisementEntityListToAdvertisementList(List<AdvertisementEntity> advertisementEntityList) {
		List<Advertisement> advertisementList = new ArrayList<Advertisement>();
		Consumer<AdvertisementEntity> consumer = (AdvertisementEntity advertisementEntity)->advertisementList.add(convertAdvertisementEntityToAdvertisement(advertisementEntity));
		advertisementEntityList.stream().forEach(consumer);
		return advertisementList;
	}
	
	public static Advertisement convertAdvertisementEntityToAdvertisement(AdvertisementEntity advertisementEntity) {
		return new Advertisement(advertisementEntity.getAdID(), advertisementEntity.getPostId(), advertisementEntity.getStatus(),advertisementEntity.getTitle(),advertisementEntity.getName(),advertisementEntity.getCategory(),advertisementEntity.getDescription());
	}

	public static AdvertisementEntity convertAdvertisementToAdvertisementEntity(Advertisement advertisement) {
		return new AdvertisementEntity(advertisement.getAdID(),advertisement.getPostId(),advertisement.getStatus(),advertisement.getTitle(),advertisement.getName(),advertisement.getCategory(),advertisement.getDescription());
	}

}
