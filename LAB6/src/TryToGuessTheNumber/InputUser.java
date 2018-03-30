package TryToGuessTheNumber;

import java.util.Scanner;

public class InputUser {
	
	private static Scanner scanner = new Scanner (System.in);
	
	public static int inputInt (String msg) {
		System.out.print(msg);
		return scanner.nextInt();
	}
	
	
	public static String inputStr (String msg) {
		System.out.print(msg);
		return scanner.next();

	}
	
	
	public static Boolean isReady (String msg) {
		Boolean isReadyAgain;
		String answer;
		
		System.out.print(msg);
		answer = scanner.next();
		if (answer.toLowerCase().equals("yes") ||answer.toLowerCase().equals("y") || answer.toLowerCase().equals("ye")) {
			isReadyAgain = true;}
		else {
			isReadyAgain = false;
		}
		return isReadyAgain; 
	}
}

