package com.assignment.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.assignment.model.LeaveRequest;
import com.assignment.repository.LeaveRequestRepository;

@Service
public class LeaveRequestService {
	private LeaveRequestRepository leaveRequestRepository;

	public LeaveRequestService(LeaveRequestRepository leaveRequestRepository) {
		this.leaveRequestRepository = leaveRequestRepository;
	}

	public List<LeaveRequest> getAllLeaveRequests() {
		return leaveRequestRepository.findAll();
	}

	public void addLeaveRequest(LeaveRequest leaveRequest) {
		leaveRequestRepository.save(leaveRequest);
	}

	public LeaveRequest getLeaveRequestById(Long id) {
		return leaveRequestRepository.findById(id).get();
	}

	public void updateLeaveRequest(Long id, LeaveRequest leaveRequest) {
		LeaveRequest existing = getLeaveRequestById(id);
		existing.setStartDate(leaveRequest.getStartDate());
		existing.setEndDate(leaveRequest.getEndDate());
		existing.setStatus(leaveRequest.getStatus());
		existing.setEmployee(leaveRequest.getEmployee());
		existing.setLeaveType(leaveRequest.getLeaveType());
		addLeaveRequest(existing);
	}

	public void deleteLeaveRequest(Long id) {
		leaveRequestRepository.deleteById(id);
	}

	public List<LeaveRequest> getLeaveRequestsByEmployeeId(Long employeeId) {
		return leaveRequestRepository.findAll().stream()
				.filter(lr -> lr.getEmployee() != null && lr.getEmployee().getId().equals(employeeId))
				.collect(Collectors.toList());
	}
}
