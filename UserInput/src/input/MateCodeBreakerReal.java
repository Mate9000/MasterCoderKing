package input;

//dit gebruik ik om een randomizer in the laden zodat ik een random code generator kan maken
import java.util.Random;
//dit is zodat je kan typen later op in de code
import java.util.Scanner;

public class MateCodeBreakerReal {
	public static void main(String[] args) {

		String userInput;

		int geuss = 10;
		int i;

		Scanner sc = new Scanner(System.in);
		Random Random = new Random();

		int x = Random.nextInt(6);
		int y = Random.nextInt(6);
		int z = Random.nextInt(6);
		int w = Random.nextInt(6);

		String secretCode = ("" + x + y + z + w);

		System.out.println(secretCode);

		for (i = 1; i <= geuss; i++) {
			System.out.println(i);

			userInput = sc.nextLine();
			if (userInput.equals(secretCode)) {
				System.out.println("Yippieeeee! You win!");
			}

		}

	}
}
