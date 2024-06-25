package edu.atria.java.exception;

import java.util.Scanner;

public class AgeTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		AgeTest at = new AgeTest();
		System.out.println("Enter age");
		age = sc.nextInt();
		
		try {
			at.validate(age);;
		}catch(InvalidAgeException ex) {
			System.err.println("Caught an exception"+ ex.getMessage());
		}
		sc.close();
	}

}
