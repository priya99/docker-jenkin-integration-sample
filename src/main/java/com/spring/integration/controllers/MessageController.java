package com.spring.integration.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	
	@GetMapping("/getMsg")
	public String getMessage() {
		return "Hi There!!!";
	}
	
	@GetMapping("/")
	public String appDetails() {
		return "App is Up and Running!!!";
	}
}
