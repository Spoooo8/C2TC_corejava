package edu.atria.java.polymorphism;

public class OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//runtime polymorphism using method overriding
		Rbi bankOne = new Sbi();
		System.out.println(bankOne.getRI());
		
		Rbi bankTwo = new Icici();
		System.out.println(bankTwo.getRI());
	}

}
