package TASK5А;

import java.sql.Array;
import java.util.ArrayList;

//5) Разработайте программу, которая проверяет, что среди чисел А, В и С есть
//только одно положительное (отрицательное).

public class Logic5A {
	public static boolean solve (double a, double b, double c) {
		int countOfPositiveNumber=0;
		boolean onlyOneIsPositive = true;
		
//		if(((a > 0) && (b <= 0) && (c <= 0)) || ((a <= 0) && (b > 0) && (c <= 0)) || ((a <= 0) && (b <= 0) && (c > 0))) {
//			return onlyOneIsPositive;}
//			else {return !onlyOneIsPositive;}
		
	 double []arrayOfNumbers = new double [3];
	 arrayOfNumbers[0] = a;
	 arrayOfNumbers[1] = b;
	 arrayOfNumbers[2] = c;
	 
	 for(int i = 0; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]> 0)
			 countOfPositiveNumber++;
	 }
	 if (countOfPositiveNumber==1)
		 return onlyOneIsPositive;
	 else return !onlyOneIsPositive;
	}
	
	
}