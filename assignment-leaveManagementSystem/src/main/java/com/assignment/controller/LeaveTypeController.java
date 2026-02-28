package com.assignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.model.LeaveType;
import com.assignment.service.LeaveTypeService;

@Controller
@RequestMapping("/api")
public class LeaveTypeController {
	private LeaveTypeService leaveTypeService;

	public LeaveTypeController(LeaveTypeService leaveTypeService) {
		this.leaveTypeService = leaveTypeService;
	}

	@GetMapping("/leavetypes")
	public String getLeaveTypes(Model model) {
		List<LeaveType> leaveTypes = leaveTypeService.getAllLeaveTypes();
		model.addAttribute("leaveTypes", leaveTypes);
		return "leaveTypes";
	}

	@GetMapping("/addleavetype")
	public String showAddLeaveTypeForm(Model model) {
		model.addAttribute("leaveType", new LeaveType());
		return "addLeaveType";
	}

	@PostMapping("/addleavetype")
	public String addLeaveType(@ModelAttribute("leaveType") LeaveType leaveType) {
		leaveTypeService.addLeaveType(leaveType);
		return "redirect:/api/leavetypes";
	}

	@GetMapping("/editleavetype/{id}")
	public String showEditLeaveTypeForm(@PathVariable Long id, Model model) {
		LeaveType leaveType = leaveTypeService.getLeaveTypeById(id);
		model.addAttribute("leaveType", leaveType);
		return "editLeaveType";
	}

	@PostMapping("/editleavetype/{id}")
	public String editLeaveType(@PathVariable Long id, @ModelAttribute("leaveType") LeaveType leaveType) {
		leaveTypeService.updateLeaveType(id, leaveType);
		return "redirect:/api/leavetypes";
	}

	@PostMapping("/deleteleavetype/{id}")
	public String deleteLeaveType(@PathVariable Long id) {
		leaveTypeService.deleteLeaveType(id);
		return "redirect:/api/leavetypes";
	}
}
