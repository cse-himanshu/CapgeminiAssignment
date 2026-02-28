package com.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.model.LeaveType;
import com.assignment.repository.LeaveTypeRepository;

@Service
public class LeaveTypeService {
	private LeaveTypeRepository leaveTypeRepository;

	public LeaveTypeService(LeaveTypeRepository leaveTypeRepository) {
		this.leaveTypeRepository = leaveTypeRepository;
	}

	public List<LeaveType> getAllLeaveTypes() {
		return leaveTypeRepository.findAll();
	}

	public void addLeaveType(LeaveType leaveType) {
		leaveTypeRepository.save(leaveType);
	}

	public LeaveType getLeaveTypeById(Long id) {
		return leaveTypeRepository.findById(id).get();
	}

	public void updateLeaveType(Long id, LeaveType leaveType) {
		LeaveType existing = getLeaveTypeById(id);
		existing.setLeaveName(leaveType.getLeaveName());
		existing.setMaxDayAllowed(leaveType.getMaxDayAllowed());
		addLeaveType(existing);
	}

	public void deleteLeaveType(Long id) {
		leaveTypeRepository.deleteById(id);
	}
}
