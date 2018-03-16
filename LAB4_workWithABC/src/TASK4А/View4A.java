package TASK4À;

import java.util.Scanner;

import TASK2A.Logic2A;

public class View4A {
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
			
		System.out.println("\"A minimum of one number from input numbers are positive\". This statement is " + Logic2A.solve(number1, number2, number3) +".");	
		}
}
