package RecursionPow;


import java.util.Scanner;

public class InputUser {

	private static Scanner scanner = new Scanner (System.in);
	
	public static int inputInt (String msg1) {
		System.out.print(msg1);
		return scanner.nextInt();
	}	
	
	
public static double inputDouble (String msg2) {
		System.out.print(msg2);
		return scanner.nextDouble();
	}


}