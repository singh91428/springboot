package com.sb.web.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.web.dao.UserRepository;
import com.sb.web.model.Employee;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public Employee saveData(Employee emp) {
		Employee obj=userRepository.save(emp);
		return obj;
	}
	public List<Employee> allData(){
		return  userRepository.findAll();
	}
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}
	
	public Employee finfById(Integer id) {
		Optional<Employee> obj=userRepository.findById(id);
		Employee e=obj.get();
		return e;
	}
	
	
	public void updateEmp(Employee emp) {
		userRepository.saveAndFlush(emp);
	}
	public List<Employee> findEmpByName(String name){
		List<Employee> emp= userRepository.findByName(name);
		return emp;
	}
}
