package challenges.task3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //using for loop multiplication table for a number
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();
       for (int i=1;i<=10;i++){
           System.out.println(num + " X " + i +" = " + num*i);

       }
    }

}
