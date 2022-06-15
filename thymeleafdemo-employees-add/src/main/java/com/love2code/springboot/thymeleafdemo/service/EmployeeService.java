package com.love2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.love2code.springboot.thymeleafdemo.entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	public Employee findById(int theID);
	public void save(Employee theEmployee);
	public void deleteById(int theID);
	
}
