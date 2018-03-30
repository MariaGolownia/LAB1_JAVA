
package TryToGuessTheNumber;

public class CheckingNumber {
    public static String isGuessedNumber (int numberOfUser, int numberOfComputer) {
    	String answerIsGuessedNumber = "";
       
    	if (numberOfUser==numberOfComputer) 
            answerIsGuessedNumber = "YES";
        		else if (numberOfUser < numberOfComputer) 
        			answerIsGuessedNumber = "HIGHER";
        				else if (numberOfUser > numberOfComputer) 
        					answerIsGuessedNumber = "LOWER";
    	return answerIsGuessedNumber;
    }
    
}
