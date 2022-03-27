package com.sb.web.controller;

import java.io.IOException;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sb.web.fileload.FileUpploade;

@RestController
public class FileController {
	@Autowired
	private FileUpploade fileUpploade;
	@PostMapping("/save")
	public ResponseEntity<String> load(@RequestParam("file") MultipartFile file){
		boolean b=false;
//		System.out.println(file.getName());
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
//		System.out.println(file.getOriginalFilename());
		if(file.isEmpty()){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("must contain file");
		}
		if(!file.getContentType().equalsIgnoreCase("image/png")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only png file allowed");
		}
		b=fileUpploade.fileUpload(file);
		if(b)
		{
			//ResponseEntity.status(HttpStatus.OK).body("file uploaded successfully");
			
			//get image url
			return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
		}
		return ResponseEntity.ok("Working");
	}
}
