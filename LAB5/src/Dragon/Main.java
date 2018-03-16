package Dragon;

public class Main {
	public static void main(String[] args) {
	int numberOfYears = 0;
	int result = 0;
	
	View.ptint("The program is counting the number of heads of the dragon depending on its age.");
	View.ptint("--------------------------------------------------------------------------------");
	numberOfYears = UserInput.input("Enter the age of the dragon: ");
	
	result = Logic.solve(numberOfYears);
	View.ptint("The number of dragon heads is " + result + "!");
	
	}

}
