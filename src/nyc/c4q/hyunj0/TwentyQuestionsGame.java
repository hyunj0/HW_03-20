package nyc.c4q.hyunj0;

/**
 * Created by c4q-hyunj0 & alizinha on 3/16/15.
 */

import java.util.Scanner;
import java.util.Random;

public class TwentyQuestionsGame {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(100000) + 1;

        while (true) {
            System.out.println("guess? ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100000)
                System.out.println("please guess between 1 and 100,000");
            else if (guess > number)
                System.out.println("too high!");
            else if (guess < number)
                System.out.println("too low!");
            else {
                System.out.println("that's right!");
                break;
            }
        }
    }

}
