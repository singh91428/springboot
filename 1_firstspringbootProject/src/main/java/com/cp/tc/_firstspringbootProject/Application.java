package com.cp.tc._firstspringbootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cp.tc.dao.UserRepository;
import com.cp.tc.model.User;

@SpringBootApplication

@ComponentScan(basePackages = "com.cp.tc")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository userpero=context.getBean(UserRepository.class);
		User u=new User();
		u.setName("chandra prakash");
		u.setLocation("ranchi");
		User res=userpero.save(u);
		System.out.println("saved "+res);
	}
}
