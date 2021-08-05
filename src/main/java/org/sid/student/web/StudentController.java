package org.sid.student.web;

import java.util.List;
import java.util.Optional;

import org.sid.student.entity.Student;
import org.sid.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired 
	private StudentService studentService;
	
	@GetMapping("/getall")
	public String getall(Model model)
	
	{
		List <Student> students = studentService.getall();
		model.addAttribute("students",students);
		return "Students";
	}
	
	@RequestMapping("/getOne") 
	@ResponseBody
	public Optional<Student> getOne(Long Id)
	{
		return studentService.getOne(Id);
	}
	
	@PostMapping(value="/addNew")
	public String addNew(Student student) {
		studentService.addNew(student);
		return "redirect:/students/getall";
	}
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/students/getall";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long Id) {
		studentService.delete(Id);
		return "redirect:/students/getall";
	}
}
