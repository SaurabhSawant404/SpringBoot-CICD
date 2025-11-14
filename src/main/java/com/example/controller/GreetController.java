package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {

	
	@GetMapping("/greet")
	public String sayHello() {
		return "🚀 Starting my first Jenkins Job";
	}
	
	@GetMapping
	public String welcome() {
		return "Welcome in CloudOptimo Server";
	}
}
