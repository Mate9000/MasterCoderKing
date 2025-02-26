package savingsAccount;


public class AccountTest {

	public static void main(String[] args) {

		Savings Save = new Savings();
		Save.Name = "Niek";
		Save.deposit(1000);
		System.out.println(Save.Name);

		
	}

}
