package input;

//dit gebruik ik om een randomizer in the laden zodat ik een random code generator kan maken
import java.util.Random;
//dit is zodat je kan typen later op in de code
import java.util.Scanner;

public class MateCodeBreakerReal {
	//ik heb dit nodig want anders werkt de hele code niet meer
	public static void main(String[] args) {

		//ik gebruik dit om later op een andere code te maken die de 4 integers naar 4 digit code in een string kan gezet worden en niet bij elkaar opgeteld
		String userInput;

		int geuss = 10;
		int i;

		Scanner sc = new Scanner(System.in);
		Random Random = new Random();
		//met deze ints maak ik de 4 digit code apart nummers zodat ik later op de x y z en waparte cijfer maak zodat er later op code controle werkt
		int x = Random.nextInt(6);
		int y = Random.nextInt(6);
		int z = Random.nextInt(6);
		int w = Random.nextInt(6);
        
		//door x y z en w zo hier onder zo te zetten heb ik de secret code gemaakt niet met een while loop want ik snap while loop nogsteeds niet
		String secretCode = ("" + x + y + z + w);
		
		String guessStr = sc.next();
		int a = Character.getNumericValue(guessStr.charAt(0));
		int b = Character.getNumericValue(guessStr.charAt(0));
		int c = Character.getNumericValue(guessStr.charAt(0));
		int d = Character.getNumericValue(guessStr.charAt(0));

		System.out.println(secretCode);

		for (i = 1; i <= geuss; i++) {
			System.out.println("attempt:"+i);
			userInput = sc.nextLine();
			if (userInput.equals(secretCode)) {
				System.out.println("Yippieeeee! You win!"); }
				
				for (i = 1; i <= geuss; i++) {
					System.out.println("attempt:"+i);
					userInput = sc.nextLine();}
					
					if (userInput.equals(secretCode)) {
						System.out.println("Yippieeeee! You win!");}
					
					if(i < geuss) {
						System.out.println("Womp, Womp!");
					
					if (a == x) {
					            System.out.print("G");
					        } else if (a == y || a == z || a == w) {
					            System.out.print("N");
					        } else {
					            System.out.print("-");
					        }
					if (b == y) {
			            System.out.print("G");
			        } else if (b == x || b == z || b == w) {
			            System.out.print("N");
			        } else {
			            System.out.print("-");
			        }
					
					if (c == z) {
			            System.out.print("G");
			        } else if (c == y || c == x || c == w) {
			            System.out.print("N");
			        } else {
			            System.out.print("-");
			        }
					
					if (d == w) {
			            System.out.print("G");
			        } else if (a == y || a == z || a == w) {
			            System.out.print("N");
			        } else {
			            System.out.print("-");
			        }
						
			}

		}

	}
}
