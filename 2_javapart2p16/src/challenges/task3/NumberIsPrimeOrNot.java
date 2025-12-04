package challenges.task3;

import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
    //to display if a number is prime or not using for-loop
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        System.out.println("your number is "+
                (isPrime ? "Prime": "not Prime"));
    }
    public static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
