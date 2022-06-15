package com.love2code.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.love2code.springboot.thymeleafdemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //Entity type -> Employee, Primary Key -> Integer

	//that's it... no need to write any code Lol
	//Get CRUD methods for free
	//no need for implementation class
	
}
