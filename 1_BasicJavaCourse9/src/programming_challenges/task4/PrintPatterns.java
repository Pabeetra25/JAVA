package programming_challenges.task4;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        //c27.create the print patterns
        //p1 *
        //   * *
        //   * * *
        //   * * * *
        //   * * * * *
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no.of rows");
        int rows=input.nextInt();
        printLeftHalPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printRightHalfPyramid(rows);

    }
    public  static  void printLeftHalPyramid(int maxRows){
        System.out.println("\nHere is Left Half Pyramid");
        int rows=maxRows;
        while(rows> 0){
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }



    //p2
    //  * * * * *
    //  * * * *
    //  * * *
    //  * *
    // *
    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    //p3.
    //        *
    //      * *
    //    * * *
    //  * * * *
    //* * * * *
    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
