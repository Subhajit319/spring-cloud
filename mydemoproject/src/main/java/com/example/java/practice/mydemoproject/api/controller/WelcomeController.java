package com.example.java.practice.mydemoproject.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.practice.mydemoproject.entity.AuthenticationRequest;
import com.example.java.practice.mydemoproject.util.JwtUtil;

@RestController
public class WelcomeController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String welcome() {
		
		return "welcome to hell";
		
		
	}
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthenticationRequest request) throws Exception{		
		
		try {
		authenticationManager.authenticate(				
				new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
				);
		
		}catch(Exception ex) {
			
			throw new Exception("Invalid user name and password");
		}
		
	return	jwtUtil.generateToken(request.getUserName());
		
		
		
	}

}
