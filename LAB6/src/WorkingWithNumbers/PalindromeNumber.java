package WorkingWithNumbers;

//задано натуральное число, проверить, является ли оно палиндромом;

public class PalindromeNumber {
	
	public static Boolean isPalindromeNumber (int number) {
		int initialNumber = 0;
		int newNumber = 0;
		
		initialNumber = number;
		
		while (number > 0) {
			newNumber += number % 10;
			if (number > 10) {
				newNumber = newNumber * 10;
			}
			number = number / 10;
		}
		
		if (initialNumber == newNumber) 
			return true;
		else return false;
	}

}

//Еще один вариант реализации данного task:
//StringBuilder builder = new StringBuilder(Integer.toString(number));
//
//return builder.equals(builder.reverse());