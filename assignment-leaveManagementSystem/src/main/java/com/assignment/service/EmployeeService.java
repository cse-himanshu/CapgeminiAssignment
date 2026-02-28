package com.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.model.Employee;
import com.assignment.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}
	
	public void updateEmployee(Long id, Employee employee) {
		Employee oldEmployee = getEmployeeById(id);
		oldEmployee.setName(employee.getName());
		oldEmployee.setEmail(employee.getEmail());
		oldEmployee.setDepartment(employee.getDepartment());
		oldEmployee.setJoining_date(employee.getJoining_date());
		addEmployee(oldEmployee);
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}
