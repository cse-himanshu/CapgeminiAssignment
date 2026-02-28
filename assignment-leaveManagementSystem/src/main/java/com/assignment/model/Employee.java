package com.assignment.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String email;
	
	private String department;
	
	private String joining_date;
	
	@OneToMany(mappedBy = "employee")
	private List<LeaveRequest> leaves;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<LeaveRequest> getLeaves() {
		return leaves;
	}



	public void setLeaves(List<LeaveRequest> leaves) {
		this.leaves = leaves;
	}



	public Employee(Long id, String name, String email, String department, String joining_date,
			List<LeaveRequest> leaves) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.joining_date = joining_date;
		this.leaves = leaves;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	
	
}
