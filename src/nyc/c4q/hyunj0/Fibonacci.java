package nyc.c4q.hyunj0;

//Created by c4q-hyunj0 & alizinha on 3/16/15.
//Updated by c4q-hyunj0 on 3/18/15.

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Find out what the n-th Fibonacci number is.");

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //TODO learn how to subscript number
        System.out.println("F" + number + " is " + fibonacci(number));
    }

    //Fibonacci Formula is Fn = Fn-1 + Fn-2
    public static int fibonacci(int answer) {
        if (answer == 1) {
            return 0;
        } else if (answer == 2) {
            return 1;
        }
        return (fibonacci(answer - 1) + fibonacci(answer - 2));
    }

}