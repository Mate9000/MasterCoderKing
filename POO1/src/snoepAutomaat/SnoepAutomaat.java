package snoepAutomaat;

public class SnoepAutomaat {

	public static void main(String[] args) {

		Snoep S01 = new Snoep("twix", "chocolate");
		Snoep S02 = new Snoep("kitkat", "breakeble chocolate");
		Snoep S03 = new Snoep("lays bbq", "potato slices that are fried");
		Snoep S04 = new Snoep("protein bar", "bar with allot of protein");
		S01.print();
		S02.print();
		S03.print();
		S04.print();
	}

}