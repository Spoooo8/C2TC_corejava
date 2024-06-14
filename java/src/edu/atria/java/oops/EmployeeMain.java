package edu.atria.java.oops;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the employee details"); int id = sc.nextInt();
		 * String name = sc.next(); double salary = sc.nextDouble(); String designation
		 * = sc.next();
		 */

		// className objName = new className();

		// Employee eOne = new Employee();
		// System.out.println(eOne);

		/*
		 * eOne.setEmp_id(id); eOne.setEmp_name(name); eOne.setSalary(salary);
		 * eOne.setDesignation(designation);
		 */

		/*
		 * System.out.println("Employee Id = "+eOne.getEmp_id());
		 * System.out.println("Employee Name = "+eOne.getEmp_name());
		 * System.out.println("Employee Salary = "+eOne.getSalary());
		 * System.out.println("Employee designation = "+eOne.getDesignation());
		 */

		// calling parameterized constructor
		Employee eTwo = new Employee(107, "spoo", 30000.00, "Ml_engineer");
		System.out.println(eTwo);
	}

}
