package Cake;

import java.util.Random;

//5) Напишите программу – симулятор пирожков с «сюрпризом». Программа
//должна выводить пирожок и один из пяти (можно больше) различных «сюр-
//призов», который бы выбирался случайным образом.

public class Logic {
	
	public static String solve () {
		int numberOfSuprises = 0;
		
		String[] arrayOfSuprises = new String [] {"Strawberry", "Elephant", "Carpet", "Truffle", "Macadamia", "Black caviar"};
		Random random = new Random ();
		numberOfSuprises = random.nextInt(arrayOfSuprises.length);
		
		return arrayOfSuprises[numberOfSuprises];
	}

}
