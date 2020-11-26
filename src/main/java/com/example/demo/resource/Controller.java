package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

	@GetMapping
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("all")
	public String helloAll() {
		return "Hello All";
	}
	
}
