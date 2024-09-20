package chickens02.java;

import java.util.Scanner;

public class Chickens02 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int dag1 = sc.nextInt();
    	int dag2 = sc.nextInt();
    	int dag3 = sc.nextInt();
    	
    	sc.close();
    	
    	int sum = dag1 + dag2 + dag3;
    	int dailyAverage = sum/3;
    	int monthlyAverage = sum/3*4;
    	double monthlyProfit = sum*0.18;
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
