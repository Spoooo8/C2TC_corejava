package edu.atria.java.inheritence;

public class MP extends Citizen {
	private int Id;
	private String name;
	private String party;

	public MP(long aadharNo, long voterid, String nationality, int id, String name, String party) {
		super(aadharNo, voterid, nationality);
		Id = id;
		this.name = name;
		this.party = party;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "MP [Id=" + Id + ", name=" + name + ", party=" + party + ", getAadharNo=" + getAadharNo()
				+ ", getVoterid=" + getVoterid() + ", getNationality=" + getNationality() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
