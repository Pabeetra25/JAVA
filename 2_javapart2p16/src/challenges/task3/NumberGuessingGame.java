package challenges.task3;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //to implement a number guessing game using do-while loop
        Scanner input=new Scanner(System.in);
//
        int num=8,guess;
        do{
            System.out.println("Please guess the number between 1 and 10");
            guess=input.nextInt();
        }while (num !=guess);
        System.out.println("you have guessed the number successfully");
    }
}
