package edu.atria.java.multithreading;
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//newborn or transient state
		ChildThread t1 = new ChildThread(5, "first");
		ChildThread t2 = new ChildThread(10, "second");
		
		//to begin execution
		t1.start(); //internally overrides the run method in ChildThread class
		t2.start();
		System.out.println("End of main");
	}
	
}
