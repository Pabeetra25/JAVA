package programming_challenges.task4;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        //c23.reverse the digits of a number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int num = input.nextInt();
        int reverse=reverse(num);
        System.out.println("reverse of "+num+ " is " + reverse);
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
