package TASK10А;
//10) Разработайте программу, которая проверяет, что числа А, В и С имеют одина-
//ковую чётность.
public class Logic10A {
	public static boolean solve (double a, double b, double c) {
		int countOfEvenNumber = 0;
		boolean isTheSameParity = true;
		
	 double []arrayOfNumbers = new double [3];
	 arrayOfNumbers[0] = a;
	 arrayOfNumbers[1] = b;
	 arrayOfNumbers[2] = c;
	 
	 for(int i = 0; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]%2==0)
			 countOfEvenNumber++;
		 }
	 if (countOfEvenNumber==0 || countOfEvenNumber==arrayOfNumbers.length)
		 return isTheSameParity;
	 else return !isTheSameParity;
	}
}
