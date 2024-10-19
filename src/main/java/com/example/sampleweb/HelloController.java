package com.example.sampleweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {

		return "Hello Ninja";
	}

	@GetMapping
	public String service() {

		return "Sample Web App";
	}

}
