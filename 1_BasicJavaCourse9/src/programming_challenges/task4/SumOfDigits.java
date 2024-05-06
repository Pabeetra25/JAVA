package programming_challenges.task4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //c19-sum of the digits of an integer
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=input.nextInt();

       int result= SumOfDigits(n);
        System.out.println("sum of digits of "+ n + " is "+ result);
    }
    public  static int SumOfDigits(int num){
        int sum=0;
        while (num !=0){
            sum+=num%10;
            num /=10;
        }
        return  sum;
    }
}
