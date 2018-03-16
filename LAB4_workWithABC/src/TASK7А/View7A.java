package TASK7А;

import java.util.Scanner;

public class View7A {
public static void main(String[] args) {
	
	System.out.println("Enter 3 even or 3 odd numbers!");
		
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a first double number: ");
			number1 = scanner.nextDouble();
			
		do {
		System.out.println("Enter a second double number that matching parity with the number 1: "); // Просьба ввести число совпадающее по четности с предыдущим
			number2 = scanner.nextDouble();
			if(number2%2 != number1%2)
			System.out.println("Error: the parity of numbers is not the same. Please try again.");
		} while (number2%2 != number1%2);
		
		do {
		System.out.println("Enter a third double number that matching parity  with the number 1 and the number 2: ");
			number3 = scanner.nextDouble();
			if(number3%2 != number2%2)
			System.out.println("Error: the parity of numbers is not the same. Please try again.");
		}while (number3%2 != number2%2);
		
			System.out.println("\"The entered numbers are even\". This statement is " + Logic7A.solve(number1, number2, number3) +".");	
		}
}
