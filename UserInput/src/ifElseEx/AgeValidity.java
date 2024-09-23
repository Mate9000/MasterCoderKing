package ifElseEx;

import java.util.*;

public class AgeValidity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("are you a young driver? we would like to know your age");
		int age = sc.nextInt();
		int drivingUnderAge = 18;
		int drivingAtAge = 18;
		if (age < 0) {
			System.out.println("stop goofing around");
		} else {
			if (age < drivingUnderAge) {
				System.out.println("dont drive you degen");
			} else if (age >= drivingAtAge) {
				System.out.println("you are good age to drive");
			}
		}
		sc.close();
		System.out.println("your input of age was this ->:   " + age);
	}

}
