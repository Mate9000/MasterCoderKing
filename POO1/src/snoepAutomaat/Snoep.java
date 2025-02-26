package snoepAutomaat;

public class Snoep extends SnoepAutomaat{
	public String Snoep;
	public String Omschrijving;

	public Snoep(String Sn, String O) {
		this.Snoep = Sn;
		this.Omschrijving = O;
	}

	public void print() {

		System.out.println(this.Snoep);
		System.out.println(this.Omschrijving);
	}
}
