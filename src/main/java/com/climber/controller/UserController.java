package com.climber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@GetMapping(value = "/login")
	 public String test() {
		return "super_admin";
	}
}
