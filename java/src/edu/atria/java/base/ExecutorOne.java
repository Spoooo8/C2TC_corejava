package edu.atria.java.base;

public class ExecutorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base bOne = new Base();
		
		//private members are not visible outside the class
		//System.out.println(bOne.varPrivate);
		
		System.out.println(bOne.varPublic);
		System.out.println(bOne.varProtected);
		System.out.println(bOne.varDefault);
	}

}
