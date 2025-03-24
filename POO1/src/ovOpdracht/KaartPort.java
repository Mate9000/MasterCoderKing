package ovOpdracht;

import java.util.Scanner;

public class KaartPort {

	public static void main(String[] args) {

		Kaart p01 = new Kaart(5);
		Scanner scanner = new Scanner(System.in);

		boolean checkingIn = true;

		while (checkingIn) {
			p01.displayInfo();
			System.out.println("wil je in checken? (ja/nee)");
			String userInput = scanner.nextLine();

			if (userInput.equals("ja")) {
				saldoCheck(p01);
				checkingIn = false;
			} else if (userInput.equals("nee")) {
				System.out.println("je wilde niet inchecken mischien nu well?");
			} else {
				System.out.println("ja of nee antwoorden alleen");
			}
		}

		scanner.close();
	}

	public static void saldoCheck(Kaart kaart) {

		if (kaart.getSaldo() >= 5.0 && !kaart.isChecking()) {
			System.out.println("je bent erin gecheckt.");
		} else {
			System.out.println("je mist wat geld");
		}

	}
}