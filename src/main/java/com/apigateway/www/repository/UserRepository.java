package com.apigateway.www.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.apigateway.www.model.User;

@Component
public interface UserRepository extends MongoRepository <User, String> {

	public User findUserByEmailAddress(String emailAddress);
}
