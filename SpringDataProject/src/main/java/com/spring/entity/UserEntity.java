package com.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_MASTER")
public class UserEntity {

	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name = "SESSION_ID")
	private String sessionID;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private int phone;
	
	@OneToMany
	@JoinColumn(name="user_entity_id")
	private Set<AdvertisementEntity> advertisementEntity;
	
	@OneToMany
	@JoinColumn(name="user_entity_id")
	private Set<MessageEntity> messageEntity;
	
	public UserEntity() {}

	public UserEntity(int id,String sessionID, String firstName, String lastName, String userName, String password,
			String email, int phone) {
		super();
		this.id=id;
		this.sessionID = sessionID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public Set<MessageEntity> getMessageEntity() {
		return messageEntity;
	}

	public void setMessageEntity(Set<MessageEntity> messageEntity) {
		this.messageEntity = messageEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Set<AdvertisementEntity> getAdvertisementEntity() {
		return advertisementEntity;
	}

	public void setAdvertisementEntity(Set<AdvertisementEntity> advertisementEntity) {
		this.advertisementEntity = advertisementEntity;
	}

	@Override
	public String toString() {
		return "UserEntity [sessionID=" + sessionID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		UserEntity other = (UserEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
