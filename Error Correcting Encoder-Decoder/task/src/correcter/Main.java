package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length - 1 ; i += 3) {
            var upper = Math.min(textArray.length - 1, i + 2);
            var randomIndex = getRandom(i, upper);

            textArray[randomIndex] = getRandomChar(textArray[randomIndex]);
        }

        System.out.println(textArray);
    }

    private static char getRandomChar(char forbiddenChar)
    {
        Random r = new Random();
        char c = ' ';
        do {
            c = (char) (r.nextInt('Z' - 'A') + 'A');
        } while (c == forbiddenChar);

        return c;
    }

    private static int getRandom(int lower, int upper)
    {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower;
    }
}
