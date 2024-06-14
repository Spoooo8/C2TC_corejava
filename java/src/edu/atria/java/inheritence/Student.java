package edu.atria.java.inheritence;

public class Student extends Citizen{
	
	private int studentId;
	private String name;
	private String departement;
	private String Proctor;
	
	public Student(long aadharNo, long voterid, String nationality, int studentId, String name, String departement,
			String proctor) {
		super(aadharNo, voterid, nationality);
		this.studentId = studentId;
		this.name = name;
		this.departement = departement;
		this.Proctor = proctor;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getProctor() {
		return Proctor;
	}

	public void setProctor(String proctor) {
		Proctor = proctor;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", departement=" + departement + ", Proctor="
				+ Proctor + ", getAadharNo=" + getAadharNo() + ", getVoterid=" + getVoterid()
				+ ", getNationality=" + getNationality() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
