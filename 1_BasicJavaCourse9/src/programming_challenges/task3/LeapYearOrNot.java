package programming_challenges.task3;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        //c13:determine if a given year is leap year or not
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Year:");
        int year=input.nextInt();


        if(year % 400==0 || (year % 4 == 0 && year % 100 !=0 )) {
            System.out.println("your year is leap year");
        } else{
                System.out.println("Not a leap year");
            }
        }
}
