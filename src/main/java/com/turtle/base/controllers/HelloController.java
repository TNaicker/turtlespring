package com.turtle.base.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private static final String template = "Hello, ";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public CustomMsg greeting(@RequestParam(value = "name", defaultValue = "Bank User") String name,
							  @RequestParam(value = "money", defaultValue = "0") String money,
							  @RequestParam(value = "taco", defaultValue = "hungry") String taco) {
		return new CustomMsg(counter.incrementAndGet(), money, template.concat(name), taco);
	}

}
