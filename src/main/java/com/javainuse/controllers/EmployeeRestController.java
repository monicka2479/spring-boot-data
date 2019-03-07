package com.javainuse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.EmployeeRepository;
import com.javainuse.model.Employee;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository employeeData;

	@RequestMapping(value = "/findEmployee.html/{id}")
	public Employee  findEmployee(@PathVariable Long id) {
		return employeeData.findOne(id);
	}
	
}
