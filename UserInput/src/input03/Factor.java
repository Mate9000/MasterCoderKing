package input03;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextInt();
		
		for (int i = 1; i <= userInput; i++) {
			if (userInput <=1000 || userInput <= 0) {
				System.out.println("nuh uh do something under 1000");
				sc.nextInt();
			}
			if (userInput % i == 0) {
				System.out.println( i +", ");
			}
		}
	}

}
