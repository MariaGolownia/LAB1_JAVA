package TASK11A;

import java.util.Scanner;

public class View11A {
public static void main(String[] args) {
	
		
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a first double number: ");
			number1 = scanner.nextDouble();
		System.out.println("Enter a second double number: ");
			number2 = scanner.nextDouble();
		System.out.println("Enter a third double number: ");
			number3 = scanner.nextDouble();
		
			System.out.println("\"Among the entered numbers, most of them are even or odd\". This statement is " + Logic11A.solve(number1, number2, number3) +".");	
		}
}
