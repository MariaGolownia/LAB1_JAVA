package PerfectNumber;

public class Main {
	
	public static void main(String[] args) {
		
		int numberInt;
		View.view("Program for determining whether the entered number is perfect");
		
		while (true) {
		
		numberInt=InputUser.inputInt("\nEnter any natural number: ");
		while (numberInt <= 0) {
			numberInt=InputUser.inputInt("Error! You entered a non-natural number! Enter any natural number: ");
		}
		View.view("Whether the entered number is perfect number? Answer: " + PerfectNumber.ifPerfectNumber(numberInt));}
	}

}
