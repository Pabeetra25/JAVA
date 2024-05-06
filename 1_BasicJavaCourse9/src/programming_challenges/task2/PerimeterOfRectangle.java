package programming_challenges.task2;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        //c6 To calculate perimeter of rectangle
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length of the rectangle:");
        float length= input.nextFloat();
        System.out.print("Enter breadth of the rectangle:");
        float breadth= input.nextFloat();
        float perimeter=2*(length+breadth);
        System.out.println("Perimeter of given rectangle is "+perimeter);
    }
}
