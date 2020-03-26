package com.example.demo;

// Spring
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class HelloWorld implements CommandLineRunner {
	
	@Autowired
	private CustomConfiguration properties;
	
    @Override
    public void run(String...args) throws Exception {
    	System.out.println(properties.getDemoMessage());
    }

}