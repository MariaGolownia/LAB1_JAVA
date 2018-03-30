package WorkingWithNumbers;
//найти количество различных цифр у заданного натурального числа;
public class CountOfDifferentDigits {
	public static int defineCountOfDifferentDigits (int number) {
		
		String stringDigitsOfNumber = "";
	
		while (number > 0) {
			if(!stringDigitsOfNumber.contains(String.valueOf(number % 10)))
				stringDigitsOfNumber += String.valueOf(number % 10)+" ";
				number = number / 10;
		
		}
		String[] arrayDigitsOfNumber = stringDigitsOfNumber.split(" ");
		return arrayDigitsOfNumber.length;
	}

}
