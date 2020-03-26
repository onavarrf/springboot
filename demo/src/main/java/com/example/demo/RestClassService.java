package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

// Implementar con Interfaz

@Service
public class RestClassService {
	
	@Autowired
	private CustomConfiguration properties;
	
	public String getDemoMessage(String name, String apellido) {
		return properties.getDemoMessage().
				toUpperCase().concat(" ").concat(name).concat(" ").concat(apellido);
	}

}
