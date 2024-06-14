package edu.atria.java.secondpackage;

import edu.atria.java.base.Base;

public class ExecutorTwo extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bTwo = new Base();
		
		//private members are not accessible outside the package
		//System.out.println(bOne.varPrivate);
		
		System.out.println(bTwo.varPublic);
		
		//default and protected members are not accessible outside the package
		//System.out.println(bTwo.varProtected);
		//System.out.println(bTwo.varDefault);
		
		ExecutorTwo ex = new ExecutorTwo();
		System.out.println(ex.varProtected);
	}

}
