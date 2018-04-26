package RecursionSumOfDigits;

import RecursionPow.Pow;

public class Main {

	public static void main(String[] args) {
		
		int number;
		View.view("Program for determining the sum of digits. \n");
		number = InputUser.inputInt("Enter a natural number: ");
		View.view(FrameForText.textInFrame("The sum of the digits of the number is: " + SumOfDigits.defineSumOfDigits(number)));
	
	} 
}
