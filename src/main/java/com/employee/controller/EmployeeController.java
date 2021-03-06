package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeDetails;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/app/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeDetails> saveEmployee(@RequestBody EmployeeDetails emp){
		
		EmployeeDetails savedEmpObj = 	service.saveEmp(emp);
		
		return new ResponseEntity<EmployeeDetails>(savedEmpObj ,HttpStatus.CREATED);
	}
}
