package com.sb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//this controller is designed with rest api fully
@RestController
public class UsingRestController {
	@GetMapping("/test2")
	public String getData() {
		return "this data is comming using rest controller";
	}
}
