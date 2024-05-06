package programming_challenges.task4;

import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        //c17-to sum all odd numbers from 1 to a specified number N
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number up-to which you want to add odd number:");
        int n=input.nextInt();

        int sum=0;
        for (int i=1 ;i<=n;i++){
            if(i%2 != 0) {
             sum += i;

            }
        }
        System.out.println("Sum of odd numbers: "+sum);

    }
}
