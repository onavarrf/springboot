package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.UserEntity;
import com.example.demo.repositories.UserRepository;

// Implementar con Interfaz

@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity createUser(String name) {
		
		UserEntity user = new UserEntity();
		user.setName(name);
		return userRepository.save(user);
	}
	
	public Optional<UserEntity> getUserId(Long id) {
		System.out.println("@@ ID: " + id);
		Optional<UserEntity> user = userRepository.findById(id);
		return user;
	}
	
}
