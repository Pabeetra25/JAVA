package programming_challenges.task2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        //challenge.No-9.program to convert Fahrenheit to Celsius
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        int F=input.nextInt();
        float Cel=(float)(F-32)*5/9;
        System.out.println("Resultant temperature from Fahrenheit to Celsius is :"+Cel);

    }
}
