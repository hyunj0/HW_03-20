package nyc.c4q.hyunj0;

//Created by c4q-hyunj0 on 3/18/15.

import java.util.Scanner;

public class APrettyTitle {

    public static void main(String[] args) {

        printTitle("a tale of two cities", '*');

    /*  Use the following for user input * * * * * * * * * * * * *
    *                                                             *
    *   Scanner input = new Scanner(System.in);                   *
    *                                                             *
    *   System.out.println("Check and Decorate Your Title!!");    *
    *                                                             *
    *   System.out.println("Enter a title.");                     *
    *   String title = input.nextLine();                          *
    *                                                             *
    *   System.out.println("How would you like to decorate it?"); *
    *   char textDecoration = input.next().charAt(0);             *
    *                                                             *
    *   printTitle(title, textDecoration);                        *
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    }

    public static void printTitle(String title, char textDecoration) {
        Scanner read = new Scanner(title);

        while (read.hasNext()) {
            String word = read.next();
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
        }

        System.out.println("");

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(textDecoration);
            }
        }
    }
}