package TASK7А;
//7) Разработайте программу, которая проверяет, являются ли числа А, В и С чёт-
//ными (нечётными).

public class Logic7A {
	public static boolean solve (double a, double b, double c) {
		int countOfEvenNumber = 0;
		boolean IsEven = true;
		
	 double []arrayOfNumbers = new double [3];
	 arrayOfNumbers[0] = a;
	 arrayOfNumbers[1] = b;
	 arrayOfNumbers[2] = c;
	 
	 for(int i = 0; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]%2==0)
			 countOfEvenNumber++;
		 }
	 if (countOfEvenNumber==arrayOfNumbers.length)
		 return IsEven;
	 else return !IsEven;
	}
}
