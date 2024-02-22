package com.sample.project1.sampleproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.project1.sampleproject1.model.Employee;
import com.sample.project1.sampleproject1.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		
		//System.out.println(employee);
		
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	

	public Employee getSingleEmployee(Long id) {
		
		return employeeRepository.findById(id).get();
	}

	public void deleteSingleEmployee(Long id) {
		
		 employeeRepository.deleteById(id);
	}
	
	

		
		
		
		
		
	

}
