package edu.atria.java.inheritence;

public class SingleInheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eOne = new Employee(2117376, 3475376, "Indian", 121, "spoorthi", "Front End developer", 40000.00);
		System.out.println(eOne);
		
		Citizen eTwo = new Employee(76487245,3765748,"Indian", 131, "Ravi", "Software tester", 50000.00);
		System.out.println(eTwo);
		
		Citizen cOne  = new Student(26546,8866,"Indian", 23,"spoorthi","cse","sneha");
		System.out.println(cOne);
		
		Citizen cTwo  = new MP(265456,88566,"Indian", 23,"spoo","ABC");
		System.out.println(cTwo);
	}

}
