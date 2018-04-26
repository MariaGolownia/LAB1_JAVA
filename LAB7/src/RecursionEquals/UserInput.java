//package RecursionEquals;
//
//import java.util.Scanner;
//
//public class UserInput {
//
//	public static int userInputInteger() {
//
//		Scanner scanner = new Scanner(System.in);
//		int number = 0;
//		String str;
//
//		str = scanner.nextLine();
//		if (Integer.parseInt(str) < 0) {
//			System.out.println("Error: you must enter a positive integer!");
//		} else {
//			try {
//				return Integer.parseInt(str);
//			} catch (NumberFormatException e) {
//				System.out.println("Error: you must enter a positive integer!" + e.getLocalizedMessage());
//			}
//
//			scanner.close();
//		}
//	}
//}
