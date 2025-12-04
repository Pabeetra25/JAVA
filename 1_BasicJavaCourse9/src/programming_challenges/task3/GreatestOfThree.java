package programming_challenges.task3;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        //c12:to determine the greatest among three numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        System.out.println("Enter third number:");
        int num3=input.nextInt();
         if(num1>num2 &&num1>num3){
             System.out.println(num1 +" is greatest among three numbers");
         }else {
             if(num2>num3){
                 System.out.println(num2+" is the greatest one.");
             }else{
                 System.out.println(num3+" is the greatest.");
             }
         }
    }
}
