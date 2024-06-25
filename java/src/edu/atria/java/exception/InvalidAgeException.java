package edu.atria.java.exception;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		super("Invaid Age");
	}
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
