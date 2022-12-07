package com.example.java.practice.mydemoproject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.java.practice.mydemoproject.entity.UserEntity;
import com.example.java.practice.mydemoproject.repository.UserRepository;

@SpringBootApplication
public class MydemoprojectApplication {
	
	@Autowired
	 private UserRepository userRepository;
	
	@PostConstruct
	public void init() {
	List<UserEntity> user=Stream.of(
			
				new UserEntity(101,"user","password","user@gmail.com"),
				new UserEntity(101,"user1","password1","user@gmail.com"),
				new UserEntity(101,"user2","password2","user@gmail.com"),
				new UserEntity(101,"user3","password3","user@gmail.com"),
				new UserEntity(101,"user4","password4","user@gmail.com"),
				new UserEntity(101,"user5","password5","user@gmail.com")
			
			).collect(Collectors.toList());
	
	userRepository.saveAll(user);
	
	}

	public static void main(String[] args) {
		SpringApplication.run(MydemoprojectApplication.class, args);
	}
	
	
	
	
	
	
	
	

}
