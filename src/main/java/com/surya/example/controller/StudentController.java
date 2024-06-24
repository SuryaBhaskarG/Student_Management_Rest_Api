package com.surya.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.surya.example.model.Student;
import com.surya.example.service.StudentService;

@RestController
public class StudentController
{
	
    
	@Autowired
	private StudentService studentService;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 
	 
	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student)
	{
		//log.info("Creating a new student with details: {}", student);
		//logger.debug("Creating a new student with details: {}");
		return studentService.createStudent(student);
	}
	
	//http://localhost:8080/getAll
	@GetMapping("/getAll")
	public List<Student> getAllStudentsPagination()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getAllByPagination")
	//http://localhost:8080/getAllByPagination?page=0&size=4&sort=rollno,desc
	public Page<Student> getAllStudents(Pageable pageable)
	{
		return studentService.getAllStudents(pageable);
	}
	
	@GetMapping("/getById/{id}")
	public Student getStudentByID(@PathVariable Long id )
	{
		return studentService.getStudentByID(id);
	}
	
	@PutMapping("/updateById/{id}")
	public Student updateStudentById(@PathVariable Long id,@RequestBody Student student)
	{
		 return studentService.updateStudent(id,student);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteStudentById(@PathVariable Long id)
	{
		 studentService.deleteStudent(id);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteStudentByIdwithMessage(@PathVariable Long id)
	{
		 studentService.deleteStudent(id);
		 return "User with given id deleted Successfully : 	"+id;
	}
	
	@GetMapping("/findByEmail/{email}")
    public Student findByEmailIgnoreCase(@PathVariable String email) {
        return studentService.findByEmailIgnoreCase(email);
    }

    @GetMapping("/findByFirstName/{firstName}")
    public List<Student> findByFirstName(@PathVariable String firstName) {
        return studentService.findByFirstName(firstName);
    }
    
    @GetMapping("/findByAgeRange")
    public List<Student> findStudentsByAgeRange() {
        return studentService.findStudentsByAgeRange();
    }
    
  */
}
