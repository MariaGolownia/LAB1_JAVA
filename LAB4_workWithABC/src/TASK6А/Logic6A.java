package TASK6А;
//6) Разработайте программу, которая проверяет, что среди чисел А, В и С большая
//часть положительных (отрицательных).

public class Logic6A {
	public static boolean solve (double a, double b, double c) {
		int countOfPositiveNumber=0;
		boolean mostPartIsPositive = true;
		
	 double []arrayOfNumbers = new double [3];
	 arrayOfNumbers[0] = a;
	 arrayOfNumbers[1] = b;
	 arrayOfNumbers[2] = c;
	 
	 for(int i = 0; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]> 0)
			 countOfPositiveNumber++;
		 }
	 if (countOfPositiveNumber>=(int)Math.round((double)arrayOfNumbers.length/2))
		 return mostPartIsPositive;
	 else return !mostPartIsPositive;
	}
}
