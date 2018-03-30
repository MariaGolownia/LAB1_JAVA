package WorkingWithNumbers;
// найти сумму цифр у заданного натурального числа;
public class SumOfDigitsNumber {

	public static int findSumOfDigitNumber (int number) {
		int numberSum = 0;
			
		while(number > 0) {
			numberSum += number % 10;
			number = number / 10;
		}
		return numberSum;
	}
}
