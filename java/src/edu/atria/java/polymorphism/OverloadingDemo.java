package edu.atria.java.polymorphism;

public class OverloadingDemo {
	public static void main(String [] args) {
		
		System.out.println("Addition of");
		System.out.println("Integers:" + MethoodOverloading.addition(10,49));
		System.out.println("Integer and float:" + MethoodOverloading.addition(10,49.3f));
	}
}
