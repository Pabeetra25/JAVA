package programming_challenges.task2;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        //c8:to calculate simple interest
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle:");
        int P=input.nextInt();
        System.out.print("Enter the Time:");
        int T=input.nextInt();
        System.out.print("Enter the Rate:");
        float R=input.nextFloat();
        float SI= (P*T*R)/100;
        System.out.println("Simple Interest is :"+SI);

    }
}
