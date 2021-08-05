package org.sid.student.service;

import java.util.List;
import java.util.Optional;

import org.sid.student.dao.StudentRepository;
import org.sid.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired 
	private StudentRepository studentRepository;

	@Override
	public List<Student> getall() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> getOne(Long Id) {
		return studentRepository.findById(Id);
	}

	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Long Id) {
		studentRepository.deleteById(Id);
	}
}
