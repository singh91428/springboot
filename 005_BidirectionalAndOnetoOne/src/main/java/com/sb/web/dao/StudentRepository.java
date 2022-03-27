package com.sb.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.web.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}
