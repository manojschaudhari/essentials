package com.home.webproject.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WPRestController {

	@GetMapping("api/getData")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "{ \"Hello World this saves time !!!\"}";
	}
}
