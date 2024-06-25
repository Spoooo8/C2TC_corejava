package edu.atria.java.exception;

import java.util.Scanner;

public class RuntimeException {

	public static void divide(int x, int y) {
		int z;
		try {
		z = x / y;
		System.out.println("The value of z:" + z);
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException occured"+ex.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Inside the try block");
			System.out.println("Enter two numbers.");
			x = Integer.parseInt(sc.nextLine());
			y = Integer.parseInt(sc.nextLine());
			divide(x,y);
		} catch (Exception ex) {
			System.out.println("Exception occured");
		}
	}

}
