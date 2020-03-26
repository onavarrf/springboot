package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UserEntity;
import com.example.demo.services.UserServiceInterface;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceInterface userService;
	
	@RequestMapping(value = "/createUser/{name}")
	public UserEntity createUser(@PathVariable("name") String name) {
		return userService.createUser(name);
	}
	
	@RequestMapping(value = "/getUserId/{id}")
	public Optional<UserEntity> getUserId(@PathVariable("id") Long id) {
		return userService.getUserId(id);
	}

}
