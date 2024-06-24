package com.surya.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.surya.example.model.Student;
import com.surya.example.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 
	 
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Page<Student> getAllStudents(Pageable pageable) {
		return studentRepository.findAll(pageable);
	}

	@Override
	public Student getStudentByID(Long rollno) {
		return studentRepository.findById(rollno).orElseThrow(()->new RuntimeException("Student not found with id: " + rollno));
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		
		if(studentRepository.findById(id)!=null)
		{
			Student s1=new Student();
			s1.setFirstName(student.getFirstName());
			s1.setLastName(student.getLastName());
			s1.setEmail(student.getEmail());
			s1.setAge(student.getAge());
			s1.setRollno(id);
			return studentRepository.save(s1);
		}
		else
		{
			return null;
		}		 
	}

	@Override
	public Student findByEmailIgnoreCase(String email) {
		
		 return studentRepository.findByEmailIgnoreCase(email);
	}
    @Override
    public List<Student> findByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }
    
    @Override
    public List<Student> findStudentsByAgeRange() {
        return studentRepository.findStudentsByAgeRange();
    }

*/
}
