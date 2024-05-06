package challenges.task2;

import java.util.Scanner;

public class CategorizeOnMarks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks= input.nextInt();
        String category=marks>80?"High":(marks>50?"Moderate":"Low");
        System.out.println("your category is: "+category);

    }
}
