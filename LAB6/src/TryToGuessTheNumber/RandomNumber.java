
package TryToGuessTheNumber;

import java.util.Random;

public class RandomNumber {
    
    private static Random random = new Random();
    
    public static int generateRandomNumber (int number1, int number2) {
            
        return random.nextInt(number2 - number1 + 1) + number1;
    }
    
}
