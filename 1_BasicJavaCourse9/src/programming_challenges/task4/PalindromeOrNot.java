package programming_challenges.task4;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        //26.verify if a number is a palindrome
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int num = input.nextInt();

        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome){
            System.out.println(num +" is palindrome");
        }else {
            System.out.println(num +" is not a palindrome");
        }
    }
    public static boolean isPalindrome(int n){

        return n == reverse(n);
    }

    public  static int reverse(int n){
        int newNum=0;
        while (n>0){
            int digit=n%10;
            newNum=newNum*10+digit;
            n /=10;
        }
        return newNum;
    }
}
