package programming_challenges.task3;

import java.util.Scanner;

public class GradeBasedOnMarks {
    public static void main(String[] args) {
        //c14:calculates grade based on marks
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks=input.nextInt();


        if(marks>=90){
            System.out.println("A grade");
        } else if (marks>=75 ) {
            System.out.println("B grade");
        } else if (marks>=60) {
            System.out.println("C grade");
        } else if (marks>=30) {
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }
    }
}
