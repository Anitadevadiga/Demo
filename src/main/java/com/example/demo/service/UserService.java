package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;


public interface UserService {
	List<User> getAllUsers();
	
	User saveStudent(User student);
	
	User getStudentById(Long id);
	
	User updateStudent(User student);
	
	void deleteStudentById(Long id);
}




