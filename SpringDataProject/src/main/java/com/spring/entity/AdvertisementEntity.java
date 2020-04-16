package com.spring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="AD_MASTER")
public class AdvertisementEntity {
	
	@Id
	@Column(name="ID")
	private int adID;
	
	@Column(name = "POST_ID")
	private String postId;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToOne
	private UserEntity userEntity;
	
	@OneToMany
	@JoinColumn(name="advertisement_entity_id")
	private Set<MessageEntity> messageEntity;
	
	public AdvertisementEntity() {
		
	}
	
	public AdvertisementEntity(int adID,String postId, String status, String title, String name, String category, String description) {
		this.adID=adID;
		this.postId = postId;
		this.status = status;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public AdvertisementEntity(String postId, String status, String title, String name, String category, String description) {
		this.postId = postId;
		this.status = status;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public Set<MessageEntity> getMessageEntity() {
		return messageEntity;
	}

	public void setMessageEntity(Set<MessageEntity> messageEntity) {
		this.messageEntity = messageEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public int getAdID() {
		return adID;
	}

	public void setAdID(int adID) {
		this.adID = adID;
	}

	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Advertisement [postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name
				+ ", category=" + category + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdvertisementEntity other = (AdvertisementEntity) obj;
		if (this.adID != other.getAdID())
			return false;
		return true;
	}

	
}
