package TASK13A;

import java.util.Scanner;

public class View13A {
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
			
			System.out.println("\"The four-digit number you can read the same: left-right and right-left\". This statement is " + Logic13A.CompareLeftAndRight(number) +".");	
		}
}
