package TASK20A;

import java.util.Scanner;

public class View20A {
	public static void main(String[] args) {
		double X1 = 0;
		double Y1 = 0;
		double X2 = 0;
		double Y2 = 0;
		double XOfThePoint = 0;
		double YOfThePoint = 0;
	
		String str1 = "";
		String str2 = "";
		String str3 = "";
		Scanner scanner = new Scanner (System.in);
	
		try {
		
		System.out.println("Type the space-separated coordinates of the top left vertex of the rectangle in the format (x y): ");
		str1 = scanner.nextLine().trim();
		System.out.println("Type the space-separated coordinates of the lower right vertex of the rectangle in the format (x y): ");
		str2 = scanner.nextLine().trim();
		
		String [] stringArray1 = new String [2];
		stringArray1 = str1.split(" ");
		X1 = Integer.parseInt(stringArray1[0]);
		Y1 = Integer.parseInt(stringArray1[1]);
		
		String [] stringArray2 = new String [2];
		stringArray2 = str2.split(" ");
		X2 = Integer.parseInt(stringArray2[0]);
		Y2 = Integer.parseInt(stringArray2[1]);
		
		while (X2<X1 || Y1<Y2) {
			System.out.println("Error: Check the correctness of input of the coordinates of the rectangle");
			System.out.println("Type the space-separated coordinates of the top left vertex of the rectangle in the format (x y): ");
			str1 = scanner.nextLine().trim();
			System.out.println("Type the space-separated coordinates of the lower right vertex of the rectangle in the format (x y): ");
			str2 = scanner.nextLine().trim();
		
			stringArray1 = str1.split(" ");
			X1 = Integer.parseInt(stringArray1[0]);
			Y1 = Integer.parseInt(stringArray1[1]);

			stringArray2 = str2.split(" ");
			X2 = Integer.parseInt(stringArray2[0]);
			Y2 = Integer.parseInt(stringArray2[1]);
		}
		
		if (X2>X1 && Y1>Y2) {
		System.out.println("Type the space-separated coordinates of the point in the format (x y): ");
		str3 = scanner.nextLine().trim();
		String [] stringArray3 = new String [2];
		stringArray3 = str3.split(" ");
		XOfThePoint = Integer.parseInt(stringArray3[0]);
		YOfThePoint = Integer.parseInt(stringArray3[1]);
		
		System.out.println("\"This triangle is a right triangle and isosceles" + "\". This statement is " + Logic20A.belongsToTheRectangle(X1, Y1, X2, Y2, XOfThePoint, YOfThePoint) +".");	
		}
		}
		catch (Exception e){System.out.println("Error! Try again!");}
		
	}
	
}
