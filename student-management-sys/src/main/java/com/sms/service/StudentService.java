package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sms.entity.Student;

@Component
public interface StudentService {

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	List<Student> getAllStudents();
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
