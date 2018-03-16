package TASK10À;

import java.util.Scanner;

public class View10A {
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
		
			System.out.println("\"All numbers have the same parity\". This statement is " + Logic10A.solve(number1, number2, number3) +".");	
		}
}
