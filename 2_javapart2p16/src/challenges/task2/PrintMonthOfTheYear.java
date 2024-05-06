package challenges.task2;

import java.util.Scanner;

public class PrintMonthOfTheYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month numbers:");
        int monthNumber= input.nextInt();
        String monthName=getMonthName(monthNumber);
        System.out.println("your month name is "+monthName);

    }
    public static String getMonthName(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "march";
            case 4-> "april";
            case 5 -> "may";
            case 6-> "june";
            default -> "Invalid month";

        };
    }

}
