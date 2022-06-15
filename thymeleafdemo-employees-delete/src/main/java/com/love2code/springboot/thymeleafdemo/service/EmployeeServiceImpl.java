package com.love2code.springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.love2code.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.love2code.springboot.thymeleafdemo.entity.Employee;



//In an application, the business logic resides within the service layer so we use the 
//@Service Annotation to indicate that a class belongs to that layer.
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	//@Qualofier select the particular bean, there are two beans implemts EmployeeDAO, so we use qualifier here
	// EmployeeDAOJpaImpl -> this is bean id, give the first letter of bean ID in lower case
	//remove @Transactional, spring data jpa provides it
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository=theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		//return employeeRepository.findAll();
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int theID) {
		// TODO Auto-generated method stub
		 Optional<Employee> result = employeeRepository.findById(theID);
		 Employee theEmployee=null;
		 if(result.isPresent()) {
			 theEmployee=result.get();
		 }
		 else {
			 throw new RuntimeException("Did not find employee id "+theID);
		 }
		 
		return theEmployee;
		
	}

	@Override //@Transactional
	public void save(Employee theEmployee) {
		
		employeeRepository.save(theEmployee);
		
	}

	@Override 
	public void deleteById(int theID) {
		
		employeeRepository.deleteById(theID);
	}

	

	

}
