package com.assignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignment.model.LeaveRequest;
import com.assignment.service.EmployeeService;
import com.assignment.service.LeaveRequestService;
import com.assignment.service.LeaveTypeService;

@Controller
@RequestMapping("/api")
public class LeaveRequestController {
	private LeaveRequestService leaveRequestService;
	private EmployeeService employeeService;
	private LeaveTypeService leaveTypeService;

	public LeaveRequestController(LeaveRequestService leaveRequestService, EmployeeService employeeService,
			LeaveTypeService leaveTypeService) {
		this.leaveRequestService = leaveRequestService;
		this.employeeService = employeeService;
		this.leaveTypeService = leaveTypeService;
	}

	@GetMapping("/leaverequests")
	public String getLeaveRequests(Model model) {
		List<LeaveRequest> leaveRequests = leaveRequestService.getAllLeaveRequests();
		model.addAttribute("leaveRequests", leaveRequests);
		return "leaveRequests";
	}

	@GetMapping("/leaverequests/employee/{id}")
	public String getLeaveRequestsByEmployee(@PathVariable Long id, Model model) {
		List<LeaveRequest> leaveRequests = leaveRequestService.getLeaveRequestsByEmployeeId(id);
		model.addAttribute("leaveRequests", leaveRequests);
		model.addAttribute("employeeName", employeeService.getEmployeeById(id).getName());
		return "leaveRequests";
	}

	@GetMapping("/addleaverequest")
	public String showAddLeaveRequestForm(Model model) {
		model.addAttribute("leaveRequest", new LeaveRequest());
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("leaveTypes", leaveTypeService.getAllLeaveTypes());
		return "addLeaveRequest";
	}

	@PostMapping("/addleaverequest")
	public String addLeaveRequest(@ModelAttribute("leaveRequest") LeaveRequest leaveRequest,
			@RequestParam Long employeeId, @RequestParam Long leaveTypeId) {
		leaveRequest.setEmployee(employeeService.getEmployeeById(employeeId));
		leaveRequest.setLeaveType(leaveTypeService.getLeaveTypeById(leaveTypeId));
		leaveRequestService.addLeaveRequest(leaveRequest);
		return "redirect:/api/leaverequests";
	}

	@GetMapping("/editleaverequest/{id}")
	public String showEditLeaveRequestForm(@PathVariable Long id, Model model) {
		LeaveRequest leaveRequest = leaveRequestService.getLeaveRequestById(id);
		model.addAttribute("leaveRequest", leaveRequest);
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("leaveTypes", leaveTypeService.getAllLeaveTypes());
		return "editLeaveRequest";
	}

	@PostMapping("/editleaverequest/{id}")
	public String editLeaveRequest(@PathVariable Long id,
			@ModelAttribute("leaveRequest") LeaveRequest leaveRequest,
			@RequestParam Long employeeId, @RequestParam Long leaveTypeId) {
		leaveRequest.setEmployee(employeeService.getEmployeeById(employeeId));
		leaveRequest.setLeaveType(leaveTypeService.getLeaveTypeById(leaveTypeId));
		leaveRequestService.updateLeaveRequest(id, leaveRequest);
		return "redirect:/api/leaverequests";
	}

	@PostMapping("/deleteleaverequest/{id}")
	public String deleteLeaveRequest(@PathVariable Long id) {
		leaveRequestService.deleteLeaveRequest(id);
		return "redirect:/api/leaverequests";
	}
}
