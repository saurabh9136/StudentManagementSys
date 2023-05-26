package com.sms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		Student _student = new Student();
		_student.setFirstName(student.getFirstName());
		_student.setLastName(student.getLastName());
		_student.setEmail(student.getEmail());
		return studentRepository.save(_student);
	}

	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
		System.out.println("Student with id: "+id+" Has been Deleted From Database");
	}

}
