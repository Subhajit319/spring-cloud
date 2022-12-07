package com.example.java.practice.mydemoproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserEntity {
	@Id
	private int id;
	private String userName;
	private String password;
	private String gmail;
	
	
	public UserEntity() {
		
	}	
	
	public UserEntity(int id, String userName, String password, String gmail) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.gmail = gmail;
	}

   



	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", gmail=" + gmail + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	
	

}
