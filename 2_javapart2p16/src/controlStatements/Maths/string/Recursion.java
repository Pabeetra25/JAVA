package controlStatements.Maths.string;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        System.out.println("welcome to factorial of a number:");
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=input.nextInt();

        long factNum=factorialOfNum(num);
        System.out.println("factorial of " +num + " is "+ factNum);

    }
    public static long factorialOfNum(int n){
        if ( n==1){
            return 1;
        }else{
            return (long)n*factorialOfNum(n-1);
        }
    }

}
