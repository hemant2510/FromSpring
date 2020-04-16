package com.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MESSAGE_MASTER")
public class MessageEntity  {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private int message_id;
	
	@Column(name="MESSAGE")
	private String message;
	
	@ManyToOne
	private AdvertisementEntity advertisementEntity;
	
	@ManyToOne
	private UserEntity userEntity;

	public MessageEntity() {}
	
	public MessageEntity(int message_id, String message) {
		super();
		this.message_id = message_id;
		this.message = message;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AdvertisementEntity getAdvertisementEntity() {
		return advertisementEntity;
	}

	public void setAdvertisementEntity(AdvertisementEntity advertisementEntity) {
		this.advertisementEntity = advertisementEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public String toString() {
		return "MessageEntity [message_id=" + message_id + ", message=" + message + "]";
	}
	
}
