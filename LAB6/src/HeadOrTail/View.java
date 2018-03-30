package HeadOrTail;
//1) Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), кото-
//рая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
//сколько раз выпал орёл, а сколько – решка.
public class View {
   
    public static void main(String[] args) {

        int numberOfTosses;

        ConsolePrinter.printToConsole("Mini-program \"Head or tail of coin\"");

        numberOfTosses = InputUsers.inputInt("Enter how many number of times you want to toss a coin:");
     
        int heads = HeadOrTails.countHeads(numberOfTosses);

        ConsolePrinter.printToConsole("\nCongratulate!\n" + "The head of coin fell "
                + heads + " times!" + "\nThe tail of coin fell "
                + (numberOfTosses - heads) + " times!");
        
     }

}

