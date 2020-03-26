package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entities.UserEntity;

public interface UserServiceInterface {
	
	public UserEntity createUser(String name);
	public Optional<UserEntity> getUserId(Long id);

}
