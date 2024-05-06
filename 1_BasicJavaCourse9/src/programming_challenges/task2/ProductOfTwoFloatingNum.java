package programming_challenges.task2;

import java.util.Scanner;

public class ProductOfTwoFloatingNum {
    public static void main(String[] args) {
        //c5 to calculate product of two floating numbers
//        float n1=3.2f;
//        float n2=6.2f;
//        System.out.println("product of two floating number is "+(n1*n2));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first floating number:");
        float num1=input.nextFloat();
        System.out.print("Enter second floating number:");
        float num2=input.nextFloat();
        float product=num1*num2;
        System.out.println("Product of two floating numbers is "+product);

    }}