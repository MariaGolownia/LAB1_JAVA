package TryToGuessTheNumber;

public class NumberOfAttempts {
	
	public static int viewNumberOfAttempts (int x, int y) {
		  return  (int)(Math.log(y-x) / Math.log(2) + 1);
		}

}
