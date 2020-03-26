package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "democonfiguration.demo")
public class CustomConfiguration {
	
	private String demoMessage;

	public String getDemoMessage() {
		return demoMessage;
	}

	public void setDemoMessage(String demoMessage) {
		this.demoMessage = demoMessage;
	}

}
