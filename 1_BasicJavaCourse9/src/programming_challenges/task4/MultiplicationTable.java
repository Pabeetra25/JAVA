package programming_challenges.task4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //c16.prints the multiplication table for a given number
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of which you want its multiplication table:");
        int n=input.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(i*n);
//        }

        printMultiplicationTable(n);
    }
    public static  void printMultiplicationTable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num + " x "+ i +" = " +(num * i));
            i++;
        }

    }

}
