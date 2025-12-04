package controlStatements.Maths.string;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        //for loop
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " ");
        }
        //do-while loop

        do {
            System.out.println("enter your age:");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("your age is " + age);


    //for each loop
    String[] names = new String[]{
            "Ram", "Sham", "Mohan", "sita", "geeta"
    };

    printNames(names);

}
    public static void printNames(String[] names){
          for(String name:names){
              System.out.println(name);
          }
    }
}
