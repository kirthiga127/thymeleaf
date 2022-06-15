package com.love2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.love2code.springboot.thymeleafdemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //Entity type -> Employee, Primary Key -> Integer

	//that's it... no need to write any code Lol
	//Get CRUD methods for free
	//no need for implementation class
	
	//Add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
