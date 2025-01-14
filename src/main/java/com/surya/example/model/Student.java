package com.surya.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long rollno;
	 private String firstName;
	 private String lastName;
	 private String email; 
	 private int age;
}
