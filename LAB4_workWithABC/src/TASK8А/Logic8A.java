package TASK8А;
//8) Разработайте программу, которая проверяет, что хотя бы одно из чисел А, В и
//С чётное (нечётное).

public class Logic8A {
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
	 if (countOfEvenNumber>0)
		 return IsEven;
	 else return !IsEven;
	}
}
