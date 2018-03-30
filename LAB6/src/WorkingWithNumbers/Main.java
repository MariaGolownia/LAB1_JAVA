package WorkingWithNumbers;

//4) Разработать наиболее эффективные алгоритмы и написать код для решения
//следующих задач (каждый программист должен как минимум решать данного
//рода задачи):
// найти сумму и количество цифр у заданного натурального числа;
// найти количество различных цифр у заданного натурального числа;
// найти наибольшую цифру натурального числа;
// задано натуральное число, проверить, является ли оно палиндромом;
// определить является ли заданное натуральное число простым;
// найти все простые делители заданного натурального числа;
// найти НОД и НОК двух натуральных чисел a и b.

public class Main {
	public static void main(String[] args) {
	
	int numberInt;
	int numberIntSecondForNODandNOK;
	View.view("Working with numbers");
	
	while (true) {
	
	numberInt=InputUser.inputInt("\nEnter any natural number: ");
	numberIntSecondForNODandNOK=InputUser.inputInt("Enter another natural number (to define the largest total divide (GCD) and the least common multiple (LCM) of two numbers): ");
	
	while (numberInt <= 0 || numberIntSecondForNODandNOK <= 0) {
		numberInt=InputUser.inputInt("Error! You entered a non-natural number! Enter any natural number: ");}
		//View.view("The sum of the natural number is " + SumOfDigitsNumber.findSumOfDigitNumber(numberInt) + ".");
		//View.view("The count of digits of the natural number is " + CountOfDigitsInNumber.defineCountOfDigitsInNumber(numberInt) + ".");
		//View.view("The number of different digits of the natural number is " + CountOfDifferentDigits.defineCountOfDifferentDigits(numberInt)+ ".");
		//View.view("The largest number of natural the number is " + HighestDigitOfNumber.foundDigit(numberInt)+ ".");
		//View.view("Is the number a palindrome? " + PalindromeNumber.isPalindromeNumber(numberInt)+ ".");
		//View.view("Is simple the number you entered? Answer is: " + PrimeSimpleNumber.isSimpleNumber(numberInt)+ ".");
		//View.view("All prime divisors of the natural number are: " + PrimeDivisorsOfNumber.getPrimeDivisorsOfNumber(numberInt) + ".");
		View.view("The greatest common divide of the two natural numbers  is: " + NOD.getNOD(numberInt, numberIntSecondForNODandNOK) + ".");
		View.view("The least common multiple of the two natural numbers  is: " + NOK.getNOK(numberInt, numberIntSecondForNODandNOK) + ".");
		}
	}
}