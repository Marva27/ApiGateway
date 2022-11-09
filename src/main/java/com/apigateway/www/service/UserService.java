package com.apigateway.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apigateway.www.model.User;
import com.apigateway.www.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public ResponseEntity<User> addNewUser(User user) {
		userRepository.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
