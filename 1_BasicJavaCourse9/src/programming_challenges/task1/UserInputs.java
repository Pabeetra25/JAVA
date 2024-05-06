package programming_challenges.task1;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        //c1.create a program to input name of person and respond with' welcome 'name' to Java Course'

        Scanner input=new Scanner(System.in);
        //  System.out.print(" Enter your name :");
//        String name=input.nextLine();
//        System.out.println("Welcome "+name +" to Java Course");



        //c2.create a program to add two numbers
        System.out.println("Welcome to our calculator");
        System.out.print("Enter first number:");
        int num1=input.nextInt();
        System.out.print("Enter second number:");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum of  given two numbers is:"+sum);

    }
}
