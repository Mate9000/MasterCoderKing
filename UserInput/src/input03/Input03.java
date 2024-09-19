package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
    	 Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
       
        //Find and print the sum of three integers entered by the user
    	System.out.println("Please type your three numbers..."); 
        int Number01=sc.nextInt();
        int Number02=sc.nextInt();
        int Number03=sc.nextInt();
        
        int answer=Number01 + Number02 + Number03;
        
        System.out.println(answer);
        //Remember to close the Scanner
        
        
        //Remember to close the Scanner
        sc.close();
    }
}
