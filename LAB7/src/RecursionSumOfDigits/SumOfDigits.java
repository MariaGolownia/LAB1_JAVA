package RecursionSumOfDigits;

public class SumOfDigits {
//	1) Дано натуральное число N. Разработайте метод, который вычисляет сумму его
//	цифр с использованием рекурсии.
	
	public static int defineSumOfDigits (int number) {
		
		 return (number > 0) ? number%10 + defineSumOfDigits(number/10) : number; 
	
	}
}


