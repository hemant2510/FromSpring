package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.Json.Advertisement;
import com.spring.entity.AdvertisementEntity;

@Component
public interface AdvertisementRepository extends JpaRepository<AdvertisementEntity, Long> {
	
	public List<AdvertisementEntity> findAll();
	public List<AdvertisementEntity> findByPostId(String postId);

}
