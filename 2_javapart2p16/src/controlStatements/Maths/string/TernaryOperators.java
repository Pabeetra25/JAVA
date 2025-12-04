package controlStatements.Maths.string;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to number checker\n");
        System.out.print("Enter first number:");
        int num1= input.nextInt();
        System.out.print("Enter second number:");
        int num2= input.nextInt();

        int greaterNumber= num1 > num2 ? num1:num2;
        System.out.println("greater number is "+greaterNumber);

    }
}
