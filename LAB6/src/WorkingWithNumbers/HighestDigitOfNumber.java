package WorkingWithNumbers;

public class HighestDigitOfNumber {

    public static int foundDigit(int number) {
        int lastDigitOfNumber;
        int maxDigitOfNumber = 0;

        while (number > 0) {
            lastDigitOfNumber = number % 10;
            if (lastDigitOfNumber > maxDigitOfNumber) {
                maxDigitOfNumber = lastDigitOfNumber;
            }
            number = number  / 10;
        }
        return maxDigitOfNumber;

    }

}
