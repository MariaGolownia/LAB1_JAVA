package HeadOrTail;

import java.util.Scanner;

public class InputUsers {
    
    static Scanner scanner = new Scanner (System.in);
    
    public static int inputInt (String msg) {
        int input;
        
        System.out.print(msg);
        input = scanner.nextInt();
        return input;
    }  
}
