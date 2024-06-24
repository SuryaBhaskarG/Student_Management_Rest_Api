package com.surya.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.surya.example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findByEmailIgnoreCase(String email);
    public List<Student> findByFirstName(String firstName);
    @Query(value = "SELECT * FROM Student s WHERE s.age > 18 AND s.age < 24", nativeQuery = true)
    List<Student> findStudentsByAgeRange();
	
}
