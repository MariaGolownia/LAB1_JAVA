package RecursionPow;

public class Main {

	public static void main(String[] args) {
		
		double numberBase = 0;
		int numberDegree = 0;
		
		View.view("Program for determining the value of the number in degree. \n");
		numberBase = InputUser.inputDouble("Enter a number: ");
		numberDegree = InputUser.inputInt("Enter the degree to which you want to build the entered number: ");
		View.view(FrameForText.textInFrame("The value of the number in degree is: " + Pow.definePow(numberBase, numberDegree)));
		
		
	} 
}
