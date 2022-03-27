package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	@RequestMapping("/test")
	@ResponseBody
	public String testData() {
		int a=8,b=5;
		return "addition of "+a+" and "+b+" is\t"+(a+b);
	}
}
