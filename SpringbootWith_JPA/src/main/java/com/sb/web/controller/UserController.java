package com.sb.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sb.web.model.Employee;
import com.sb.web.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/add")
	public String addData() {
		List<Employee> emp=userService.findEmpByName("Nitish");
		emp.forEach(System.out::println);
		return "home";
	}
	@RequestMapping("/save")
	public void savedData(@ModelAttribute Employee emp,HttpServletRequest request,HttpServletResponse response) {
		emp=userService.saveData(emp);
		RequestDispatcher rd=request.getRequestDispatcher("/");
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("/")
		public String allRecords(Model model){
		List<Employee> users=userService.allData();
		model.addAttribute("data", users);
		return "alldata";
		
		}
	@RequestMapping("/delete")
	public void deleteUser(@RequestParam Integer id,HttpServletRequest request,HttpServletResponse response) {
		userService.deleteById(id);
		RequestDispatcher rd=request.getRequestDispatcher("/");
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping("/get")
	public String getDataById(@RequestParam Integer id,Model model) {
		Employee emp=userService.finfById(id);
		model.addAttribute("emp", emp);
		return "update";
	}
	@RequestMapping("/update")
	public void updateData(@ModelAttribute Employee emp,HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd=request.getRequestDispatcher("/");
		try {
			rd.forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userService.updateEmp(emp);
	}
	
}
