package com.love2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love2code.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	//Load employee data
	public List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		//create employees
		Employee emp1=new Employee(1,"Kokulan","M","kokulan56@gmail.com");
		Employee emp2=new Employee(2,"Kirthiga","S","kirthiga12@gmail.com");
		Employee emp3=new Employee(1,"Rick","Grimes","rickgrimes@gmail.com");
		
		//create the list 
		theEmployees=new ArrayList<>();
		
		//add to the list
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
	}
	
	//Add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		//add to the spring model
		theModel.addAttribute("employees",theEmployees);
		return "list-employees"; //html file
	}

}
