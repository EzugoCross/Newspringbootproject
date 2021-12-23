package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/hi")
	public String sayHi() {
		System.out.println("-----Hi");
		return "Hello welcome to Spring boot world!!!";
	}
}
