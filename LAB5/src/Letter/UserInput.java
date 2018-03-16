package Letter;

import java.util.Scanner;

public class UserInput {
	
	public static Character input (String str) {
		char charletter;
		System.out.print("\n" + str);
		Scanner scanner = new Scanner (System.in);
		charletter = (scanner.nextLine()).charAt(0);
		return charletter;
	}

}
