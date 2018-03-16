package DiceGame;

public class Main {
public static void main(String[] args) {
	
	System.out.print("\t\t\tTHE GAME-DICES");
	System.out.println("\n--------------------------------------------------------------------");
	
	int countOfRolls = UserInput.input("How many dice rolls (1 times 2 dice) do you want to make? ");
	System.out.print(Logic.solve(countOfRolls));
}
}
