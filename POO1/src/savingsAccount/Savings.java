package savingsAccount;

import java.util.Scanner;

public class Savings extends AccountTest {
	Scanner sc = new Scanner(System.in);
	public double Money;
	public String Name;

	public void deposit(double x) {
		Money += x;
	}
	public void withdraw(double take) {
		sc.nextLine();
		if (Money < take) {
			System.out.println("broke boy detected no more money");
		}
		else if (Money < 0) {
			System.out.println("negatieve nummer kan je niet opnemen");
		}
		else
		{
			Money -= take;
			System.out.println(Money);
			
		}
		
	}

}
