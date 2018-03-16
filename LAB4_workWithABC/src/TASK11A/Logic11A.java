package TASK11A;
//11) Разработайте программу, которая проверяет, что среди чисел А, В и С большая
//часть чётных (нечётных).
public class Logic11A {
	public static boolean solve (double a, double b, double c) {
		int countOfEvenNumber = 0;
		int countOfOddNumber = 0;
		boolean bigPartOfEven = true;
		
	 double []arrayOfNumbers = new double [3];
	 arrayOfNumbers[0] = a;
	 arrayOfNumbers[1] = b;
	 arrayOfNumbers[2] = c;
	 
	 for(int i = 0; i < arrayOfNumbers.length; i++)
	 {
		 if (arrayOfNumbers[i]%2==0)
			 countOfEvenNumber++;
		 else
			 countOfOddNumber++;
		 }
	 if ((countOfEvenNumber>(int)Math.round((double)arrayOfNumbers.length/2) || countOfOddNumber>(int)Math.round((double)arrayOfNumbers.length/2)))
		 return bigPartOfEven;
	 else return !bigPartOfEven;

	}
}
