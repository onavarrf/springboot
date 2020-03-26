package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClassController {
	
	@Autowired
	private RestClassService service;

	@RequestMapping(value = "/getMessage/{name}")
	public String getDemoMessage(@PathVariable("name") String name, 
								 @RequestParam("apellido") String apellido) {
		return service.getDemoMessage(name, apellido);
	}

}