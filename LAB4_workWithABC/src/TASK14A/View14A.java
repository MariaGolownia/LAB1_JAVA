package TASK14A;

import java.util.Scanner;

public class View14A {
public static void main(String[] args) {
	
		int x = 0;
		int y = 0;
	
		Scanner scanner = new Scanner (System.in);
	
			System.out.println("Enter a x-coordinate: ");
			x = scanner.nextInt();
			
			System.out.println("Enter a y-coordinate: ");
			y = scanner.nextInt();
		
			System.out.println("\"Does the point with the entered coordinates belong to the I coordinate quarter?\" Answer: " + Logic14A.isI(x, y) +".");	
			System.out.println("\"Does the point with the entered coordinates belong to the II coordinate quarter?\" Answer: " + Logic14A.isII(x, y) +".");
			System.out.println("\"Does the point with the entered coordinates belong to the III coordinate quarter?\" Answer: " + Logic14A.isIII(x, y) +".");
			System.out.println("\"Does the point with the entered coordinates belong to the IV coordinate quarter?\" Answer: " + Logic14A.isIV(x, y) +".");
		}
}
