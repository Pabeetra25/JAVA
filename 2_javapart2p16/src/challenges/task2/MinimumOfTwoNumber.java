package challenges.task2;

import java.util.Scanner;

public class MinimumOfTwoNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number:");
        int n1= input.nextInt();
        System.out.print("enter second number:");
        int n2= input.nextInt();
        int minNum=n1>n2?n2:n1;
        System.out.println(minNum+" is the minimum number");
    }
}
