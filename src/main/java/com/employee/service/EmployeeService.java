package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.EmployeeDetails;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	public EmployeeDetails saveEmp(EmployeeDetails emp) {
		
		EmployeeDetails savedEmp = 	repository.save(emp);
		
		return savedEmp;
	}
	
}
