package WorkingWithNumbers;

import java.util.Scanner;

public class InputUser {

	private static Scanner scanner = new Scanner (System.in);
	
	public static int inputInt (String msg) {
		
		System.out.print(msg);
		return scanner.nextInt();
	}		
}
