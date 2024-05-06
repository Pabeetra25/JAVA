package programming_challenges.task2;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //c4.take two numbers and shows result of all arithmetic operators
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number:");
        int n1=input.nextInt();
        System.out.println("Enter Second number:");
        int n2=input.nextInt();
        System.out.println("Addition of Two numbers:"+(n1+n2));
        System.out.println("Subtraction of Two numbers:"+(n1-n2));
        System.out.println("Multiplication of Two numbers:"+(n1*n2));
        System.out.println("Division of Two numbers:"+(n1/n2));
        System.out.println("Modulus of Two numbers:"+(n1%n2));


    }
}
