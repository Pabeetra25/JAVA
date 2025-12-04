package programming_challenges.task3;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //Challenge.no10-program to determine if a number is positive,negative or zero
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();

        if(num>0){
            System.out.println(num +" is a positive number");
        } else if (num<0) {
            System.out.println(num +" is a negative number");
        }
        else {
            System.out.println("number is zero");
        }
    }
}
