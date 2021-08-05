package org.sid.student.service;

import java.util.List;
import java.util.Optional;

import org.sid.student.entity.Student;

public interface StudentService {
	
	public List <Student> getall();
	public Optional<Student> getOne(Long Id);

	public void addNew(Student student);
	
	public void update(Student student);
	
	public void delete(Long Id) ;
}
