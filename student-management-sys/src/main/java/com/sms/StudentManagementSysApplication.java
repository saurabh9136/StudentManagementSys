package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

import lombok.Builder;

@SpringBootApplication
public class StudentManagementSysApplication implements Runnable {

	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSysApplication.class, args);
	}

	@Override
	public void run() {
		Student _student = new Student();
		_student.setFirstName("rishabh");
		_student.setLastName("Giri");
		_student.setEmail("rg@gmail.com");
		
		studentRepository.save(_student);
		
	}

}
