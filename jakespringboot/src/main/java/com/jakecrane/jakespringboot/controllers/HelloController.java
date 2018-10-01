package com.jakecrane.jakespringboot.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping("/hello")
	@CrossOrigin(origins = { "http://127.0.0.1:8080", "http://localhost:8080" })
	public String index() {
		return "Greetings from Spring Boot!";
	}

}