package programming_challenges.task4;

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        //c22.check whether given number is prime or not
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime){
            System.out.println("your number is prime");
        }else{
            System.out.println("your number is not prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while (i <num){
            if(num % i == 0){
              return  false;
            }
            i++;
        }
        return true;
    }
}
