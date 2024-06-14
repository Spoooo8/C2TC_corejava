package edu.atria.java.statickeyword;

public class Employee {
	private int empId; // instance variable
	private String empName; // and non static

	private static String company = "IBM"; // static or class variable

	// constructor
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	//to Strings
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName +", company="+ company+ "]";
	}
	
}
