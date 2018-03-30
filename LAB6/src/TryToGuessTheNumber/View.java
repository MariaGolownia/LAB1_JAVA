
package TryToGuessTheNumber;
//Разработать интерактивную программу «Try to Guess the Number» («Попробуй
//угадать число»), которая эмулирует классическую игру на отгадывание числа.
//Суть программы (игры) сводиться к следующему: компьютер генерирует слу-
//чайное число из диапазона, к примеру, от 1 до 100, а пользователь (далее иг-
//рок) пытается отгадать число за минимальное количество попыток. При каж-
//дой очередной попытке компьютер «подсказывает» игроку, как соизмеряется
//предложенный вариант игрока с действительным загаданным компьютером
//числом: загаданное число больше или меньше указанного (higher/lower). Как
//только игрок отгадывает число, компьютер должен «поздравить» его с выво-
//дом на экран соответствующей мощной надписи, угаданного числа и количе-
//ство затраченных игроком попыток. Далее компьютер может «предложить»
//повторно сыграть игру или выйти из программы.
//Для универсальности предложенной программы можно добавить возмож-
//ность выбора диапазона генерирования компьютером случайных чисел, а
//также задания ограничения на количество попыток. В случае, если игрок не
//укладывается в заданное количество попыток (т.е. проигрывает), программа
//должна выводить суровую надпись «Game Over».
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        int hiddenNumber;
        int numberOfUser;
        int lowerLimitNumber;
        int upperLimitNumber;
        int numberOfAttempts;
        int totalNumberOfAttempts;
        int countOfNumberOfAttempts = 0;
        Boolean isAgain = true;
             
        System.out.println(FrameForText.textInFrame("GAME: \"Try to Guess the Number\""));
        do {
        countOfNumberOfAttempts = 0;
        lowerLimitNumber =  InputUser.inputInt("Enter the lower limit of the range of numbers to guess: ");
        upperLimitNumber =  InputUser.inputInt("Enter the upper limit of the range of numbers to guess: ");
        
      
        hiddenNumber = RandomNumber.generateRandomNumber(lowerLimitNumber, upperLimitNumber);
        numberOfAttempts = NumberOfAttempts.viewNumberOfAttempts(lowerLimitNumber, upperLimitNumber);
        totalNumberOfAttempts = numberOfAttempts;
        System.out.print("\nThe computer made a number! \nNumber of attempts to guess: " + numberOfAttempts + ". ");
        
        numberOfUser = InputUser.inputInt("\nHow do you think what number is hidden? Enter a number: ");
        numberOfAttempts--;
        countOfNumberOfAttempts++;
        while (!CheckingNumber.isGuessedNumber(numberOfUser, hiddenNumber).equals("YES") && numberOfAttempts > 0)
        	{
        	System.out.println("No! That's the wrong number!");
                	
        	if (CheckingNumber.isGuessedNumber(numberOfUser, hiddenNumber)=="LOWER") {
        			System.out.print(FrameForText.textInFrame("The hidden number is LOWER!"));}
        				else {System.out.print(FrameForText.textInFrame("The hidden number is HIGHER! "));}
        			System.out.println("\nNumber of attempts to guess: " + numberOfAttempts + ". ");
        			numberOfUser = InputUser.inputInt("Try again: ");	
        			numberOfAttempts--;
        			countOfNumberOfAttempts++;
        	}
        		
          
        if (CheckingNumber.isGuessedNumber(numberOfUser, hiddenNumber).equals("YES")) {
             System.out.println(LabelByCharacters.createLabel("Congratulations!") + "\n\n" + LabelByCharacters.createLabel("YOU WON!!!"));
             System.out.println(FrameForText.textInFrame("The hidden number is: " + hiddenNumber + ". Number of attempts used is: " +  countOfNumberOfAttempts + " out of " + totalNumberOfAttempts + "."));
             System.out.println(LabelByCharacters.createLabel("THE GAME IS OVER!"));;}
        
        if (numberOfAttempts <= 0 && !CheckingNumber.isGuessedNumber(numberOfUser, hiddenNumber).equals("YES")) {
        	 System.out.println(LabelByCharacters.createLabel("What a pity!  YOU LOST!"));
        	 System.out.println(FrameForText.textInFrame("The hidden number is: " + hiddenNumber + ". You've spent all your " + countOfNumberOfAttempts + " times trying to guess. "));
        	 System.out.println(LabelByCharacters.createLabel("THE GAME IS OVER!"));}
        
        isAgain = InputUser.isReady("\nDo you want to play again (enter \"yes\" or \"no\")? ");
       
        
        } while ( isAgain == true);
        
        if(isAgain==false) {
        System.out.println("\nSee you later!");}
     }
    
}
