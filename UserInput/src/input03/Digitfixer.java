package input03;

import java.util.Scanner;

public class Digitfixer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1: ");
        double input = scanner.nextDouble();
        
        System.out.print("(");
        for (int i = 0; i < 10; i++) {
            System.out.print(i < (int)(input * 10) ? 'x' : '-');
        }
        System.out.println(")");
        
        scanner.close();
    }
}