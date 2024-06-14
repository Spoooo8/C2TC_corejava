package edu.atria.java.statickeyword;

public class MyClass {
	private int section;
	private static int srNo;

	// static block
	static {
		System.out.println("within the static block...");
		srNo = 1000;
	}

	// default constructor
	MyClass() {
		System.out.println("within the defalut constructor...");
		srNo++;
	}

	// static methods
	public static void display() {
		System.out.println(srNo);
		// System.out.println(section); cannot access non static variable inside a
		// static method
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo=" + srNo + "]";
	}

}
