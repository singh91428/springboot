package com.sb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsingController {
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	@ResponseBody
	public String getData() {
		return "Data is return using simple comtroller class";
	}
}
