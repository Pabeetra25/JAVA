package programming_challenges.task2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //c7.Calculate area of triangle

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of base of the triangle:");
        int base=input.nextInt();
        System.out.print("Enter value of height of the triangle:");
        int height=input.nextInt();
        float Area=(float) 1/2*(base*height);
        System.out.println("Area of the triangle is :"+Area);


    }}
