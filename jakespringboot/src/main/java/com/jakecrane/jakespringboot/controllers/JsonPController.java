package com.jakecrane.jakespringboot.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class JsonPController {

	@RequestMapping("/jsonpService")
	// @CrossOrigin(origins = { "http://127.0.0.1:8080", "http://localhost:8080" })
	public String index() {
		return "callback('Greetings from Spring Boot!')";
	}

}