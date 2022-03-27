package com.sb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
	@GetMapping("/")
	public String getForm() {
		return "form";
	}
}
