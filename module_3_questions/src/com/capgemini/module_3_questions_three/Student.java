package com.capgemini.module_3_questions_three;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String email;
	private char gender;
	private int regno;
	private String department;

	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param gender
	 * @param regno
	 * @param department
	 */
	public Student(int id, String name, String email, char gender, int regno, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.regno = regno;
		this.department = department;
	}


	@Override
	public int hashCode() {
		return Objects.hash(department, email, gender, id, name, regno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(department, other.department) && Objects.equals(email, other.email)
				&& gender == other.gender && id == other.id && Objects.equals(name, other.name) && regno == other.regno;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", regno=" + regno
				+ ", department=" + department + "]";
	}


	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Email: " + email);
		System.out.println("Reg No: " + regno);
		System.out.println("Department: " + department);
		System.out.println();
	}
}
