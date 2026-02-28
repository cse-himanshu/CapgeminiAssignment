package com.assignment.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LeaveType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String leaveName;
	
	private Integer maxDayAllowed;
	
	@OneToMany(mappedBy = "leaveType")
	private List<LeaveRequest> leaveRequests;

	public LeaveType() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<LeaveRequest> getLeaveRequests() {
		return leaveRequests;
	}


	public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
		this.leaveRequests = leaveRequests;
	}


	public LeaveType(Long id, String leaveName, Integer maxDayAllowed, List<LeaveRequest> leaveRequests) {
		super();
		this.id = id;
		this.leaveName = leaveName;
		this.maxDayAllowed = maxDayAllowed;
		this.leaveRequests = leaveRequests;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLeaveName() {
		return leaveName;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public Integer getMaxDayAllowed() {
		return maxDayAllowed;
	}

	public void setMaxDayAllowed(Integer maxDayAllowed) {
		this.maxDayAllowed = maxDayAllowed;
	}
	
	
}
