package edu.atria.java.interfaceexample;

public class SimMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim sOne = new Jio(); //it promotes loose-coupling i.e one module will be less dependent on the other classes
		sOne.makeCall();
		sOne.sendmsg();
		
		Sim sTwo = new Airtel();
		sTwo.makeCall();
		sTwo.sendmsg();
		
	}

}
