package HeadOrTail;

import java.util.Random;

public class HeadOrTails {

    public static int countHeads(int numberOfThrows) {
        Random random = new Random();
        int result = 0;
        for (int i = 0; i < numberOfThrows; i++) {
            if (random.nextBoolean()) {
                result++;
            }
        }
        return result;
    }

}
