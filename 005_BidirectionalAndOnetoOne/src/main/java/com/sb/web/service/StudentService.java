package com.sb.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.web.dao.StudentRepository;
import com.sb.web.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
}
