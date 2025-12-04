package Java_Basics;

import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greeting();;
      int first= readNumber();
      int second=readNumber();
      int sum=first+second;
        System.out.println("Sum of two number "+sum);


    }
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number");
        int num=input.nextInt();
        return num;

    }
    public static void greeting(){
        System.out.println("Welcome to calculator");
    }
}
