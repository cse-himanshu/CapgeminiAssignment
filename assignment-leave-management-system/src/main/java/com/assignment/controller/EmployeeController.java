package com.assignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.model.Employee;
import com.assignment.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> employess = employeeService.getAllEmployees();
		model.addAttribute("employees", employess);
		return "employees";
	}
	@GetMapping("/addemployee")
	public String showAddEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "addEmployee";
	}
	@PostMapping("/addemployee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/api/employees";
	}
	
	@GetMapping("/editemployee/{id}")
	public String showEditEmployeeForm(@PathVariable Long id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "editEmployee";
	}
	
	@PostMapping("/editemployee/{id}")
	public String editEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
		employeeService.updateEmployee(id, employee);
		return "redirect:/api/employees";
	}
	
	@PostMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/api/employees";
	}
	
}
