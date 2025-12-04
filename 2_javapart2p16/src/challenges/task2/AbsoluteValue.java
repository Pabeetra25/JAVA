package challenges.task2;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        //to calculate the absolute value of a given integer
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int num= input.nextInt();
//        int absoluteValue=Math.abs(num);
//        System.out.println("Absolut value is: "+absoluteValue);
        int result=num>=0?num:-num;
        System.out.println("Absolut value is: "+result);

    }
}
