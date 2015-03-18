package nyc.c4q.hyunj0;

//Created by c4q-hyunj0 & alizinha on 3/16/15.
//Updated by c4q-hyunj0 on 3/17/15.

import java.util.Scanner;
import java.util.Random;

public class TwentyQuestionsGame {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        print("Play the 20 questions game. Guess the number between 1 to 100,000!");

        //generate a random number from 1 to 100,000
        //+1 is there to include the 100,000 since the range would be 1 to 99,999 otherwise (zero-indexed)
        int number = new Random().nextInt(100000) + 1;

        //count how many guesses it takes to guess correctly
        int counter = 0;

        //make a for loop ending at 20 tries
        for (int i = 0; i < 20; i++) {
            System.out.print("Your guess: ");
            int guess = input.nextInt();
            if (guess == number) {
                counter += 1;
                print("You guessed correct in " + counter + " tries. Good job!!");
            } else if (guess > number) {
                print("You guessed too high.");
                counter += 1;
            } else if (guess < number) {
                print("You guessed too low.");
                counter += 1;
            } else {
                print("Guess a number from 1 to 100,000 only!");
                counter += 1;
            }
        }

        print("Sorry, you ran out of guesses. You lost :(");
    }

    public static void print (String string) {
        System.out.println(string);
    }
}
