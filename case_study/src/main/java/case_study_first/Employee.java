/**
 * 
 */
package case_study_first;

import java.util.Objects;

/**
 * 
 */
public class Employee {
	private Integer employeeId;
	private String  department;
	private String  name;
	private Double  salary;
	private String designation;
	private Double  exp;
	/**
	 * @param employeeId
	 * @param department
	 * @param name
	 * @param salary
	 * @param exp
	 */
	public Employee(Integer employeeId, String department, String name, Double salary, String designation, Double exp) {
		this.employeeId = employeeId;
		this.department = department;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.exp = exp;
	}
	
	
	
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}



	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}



	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}



	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}



	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}



	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}



	/**
	 * @return the exp
	 */
	public Double getExp() {
		return exp;
	}



	/**
	 * @param exp the exp to set
	 */
	public void setExp(Double exp) {
		this.exp = exp;
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(department, designation, employeeId, exp, name, salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(exp, other.exp)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", department=" + department + ", name=" + name + ", salary="
				+ salary + ", exp=" + exp + "]";
	}
	
}
