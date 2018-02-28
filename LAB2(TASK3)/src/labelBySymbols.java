import java.util.Scanner;

public class labelBySymbols {
	public static void main(String[] args) {
		
		String enteredString;
		
		System.out.println("Enter a word or phrase or mathematical expression: ");
		Scanner scanner = new Scanner(System.in);
	
		enteredString = scanner.nextLine();

        System.out.print("\n"+ Character.seeLabel(enteredString));
		
		//System.out.println("\n\n\n\n          `¶¶¶¶```¶¶¶¶``¶¶```¶`¶¶¶¶¶");
        //System.out.println("          ¶¶`````¶¶``¶¶`¶¶¶`¶¶`¶¶");
        //System.out.println("          ¶¶`¶¶¶`¶¶¶¶¶¶`¶¶`¶`¶`¶¶¶¶");
        //System.out.println("          ¶¶``¶¶`¶¶``¶¶`¶¶```¶`¶¶");
        //System.out.println("          `¶¶¶¶``¶¶``¶¶`¶¶```¶`¶¶¶¶¶\n");
        //System.out.println("          `¶¶¶¶``¶¶``¶¶`¶¶¶¶¶``¶¶¶¶¶");
        //System.out.println("          ¶¶``¶¶`¶¶``¶¶`¶¶`````¶¶``¶¶");
        //System.out.println("          ¶¶``¶¶`¶¶``¶¶`¶¶¶¶```¶¶¶¶¶");
        //System.out.println("          ¶¶``¶¶``¶¶¶¶``¶¶`````¶¶``¶¶");
        //System.out.println("          `¶¶¶¶````¶¶```¶¶¶¶¶``¶¶``¶¶");
		
	scanner.close();
	
	}

}
