package edu.atria.java.exception;

public class AgeTest {
	public void validate(int age) throws InvalidAgeException{
		//explicitly throws exception in method keyword
		//throw exception in the boby of the method when creating an instance
		if (age<18) {
			throw new InvalidAgeException(" Invalid Age");
		}
			else
			{
				System.out.println("Welcome to vote");
			}
		}
	}
