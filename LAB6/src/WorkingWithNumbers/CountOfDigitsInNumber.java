package WorkingWithNumbers;
//найти количество цифр у заданного натурального числа;

public class CountOfDigitsInNumber {
	public static int defineCountOfDigitsInNumber (int number) {
		int numberCount = 0;
			
		while(number > 0) {
			number = number / 10;
			numberCount++;
		}
		return numberCount;
	}
}
