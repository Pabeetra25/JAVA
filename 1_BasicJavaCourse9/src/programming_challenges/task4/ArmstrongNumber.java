package programming_challenges.task4;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //c25.to check if a number is armstrong number
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  number to check  whether armstrong or  not:");
        int num=input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if (isArmstrong) {
            System.out.println(num +" is a armstrong number");
        }
    }
    public static  boolean isArmstrong(int num){
     int noOfDigits=noOfDigits(num);
     int numCopy=num;
        System.out.println("no.of digits :"+noOfDigits);
     int finalNumber=0;
     while (num>0){
         int lastDigit=num % 10;
         num /=10;
         finalNumber +=power(lastDigit, noOfDigits);
     }
     return finalNumber ==numCopy;
    }
    public static  int power(int num1,int num2){
        int result=1;
        int i=0;
        while (i<num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public  static  int noOfDigits(int num){
        int digits=0;
        while (num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
