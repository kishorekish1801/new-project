package com.project.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	@GetMapping("/hi")
	public String hello() {
		return "Hello World!";
	}
}
