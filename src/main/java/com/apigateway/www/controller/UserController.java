package com.apigateway.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apigateway.www.model.User;
import com.apigateway.www.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(name = "Add New User", consumes = "application/json", produces = "application/json", path = "/addNew")
	public ResponseEntity<User> addNewUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}
	
}
