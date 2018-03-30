package NumberConversely;

public class Main {
	
	public static void main(String[] args) {
		
		int numberInt;
		View.view("Program change the number (\"read from right to left\")");
		
		while (true) {
		
		numberInt=InputUser.inputInt("\nEnter any integer: ");
		View.view("Changed number is: " + DoingNumberConversely.doNumberConversly(numberInt));}
	}

}
