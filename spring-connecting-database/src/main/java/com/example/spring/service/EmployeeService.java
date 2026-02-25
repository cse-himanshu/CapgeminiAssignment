package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.Employee;
import com.example.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
}
