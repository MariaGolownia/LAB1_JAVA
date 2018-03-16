package TASK12A;

import java.util.Scanner;

public class View12A {
public static void main(String[] args) {
	
		int number = 0;
		String str = "";
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Enter a integer four-digit number: ");
			number = scanner.nextInt();
		   //Проверка: состоит ли число из четырех цифр
			str = Integer.toString(number);
			if(str.length()!=4)
				System.out.println("Error: the entered number is not four-digit. Please, enter a integer four-digit number!");
		} while (str.length()!=4);
		
		
			
			
			System.out.println("\"The digits of the four-digit number form an increasing sequence\". This statement is " + Logic12A.solve(number) +".");	
		}
}
