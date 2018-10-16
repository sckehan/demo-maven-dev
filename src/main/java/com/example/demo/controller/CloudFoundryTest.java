package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudFoundryTest {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${welcome}")
	private String welcome;
	
	@RequestMapping("/hello")
	String home() {
		
		return "hello world="+port+";"+welcome;
	}
}
