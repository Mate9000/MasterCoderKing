//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6
package prison;

public class PrisonTest {

	public static void main(String[] args) {

		Prisoner p01 = new Prisoner("Jonkler", 2.08, 2147483647);
		Prisoner p02 = new Prisoner("Bob", 1.50, 2);
		p01.print();
		p01.think();
		p02.print();


	}
}
