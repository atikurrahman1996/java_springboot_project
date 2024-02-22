package com.sample.project1.sampleproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.project1.sampleproject1.model.Employee;
import com.sample.project1.sampleproject1.repository.EmployeeRepository;
import com.sample.project1.sampleproject1.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired

	EmployeeService employeeService;
	
	@Autowired
	EmployeeRepository employeeRepository;     // for update employee, I autowired Employee Repository, So I don't need to go to Employee Repository class 

	// Insert data using Post method

	@PostMapping("/api/emp-create")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	// Retrieve data using Get

	@GetMapping("/api/getEmployee")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();

	}

	@GetMapping("/api/getEmployee/{id}")
	public Employee getSingleEmployee(@PathVariable(value = "id") Long id) {

		return employeeService.getSingleEmployee(id);

	}

	@DeleteMapping("/api/deleteEmployee/{id}")
	public void deleteSingleEmployee(@PathVariable(value = "id") Long id) {

		employeeService.deleteSingleEmployee(id);

	}
	
	
	@PutMapping("/api/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee){
		
		Employee getEmployee = employeeRepository.getById(id);
		getEmployee.setName(employee.getName());
		getEmployee.setAddress(employee.getAddress());
		
		Employee updatEmployee = employeeRepository.save(getEmployee);
		
		return ResponseEntity.ok().body(updatEmployee);

	}

}
