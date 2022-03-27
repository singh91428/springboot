package com.sb.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.web.model.Employee;

public interface UserRepository extends JpaRepository<Employee,Integer>{
	public List<Employee> findByName(String name);
	public Employee findByNameAndEmail(String name,String email);
	 

}
