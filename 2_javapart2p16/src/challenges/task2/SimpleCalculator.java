package challenges.task2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first numbers:");
        int n1= input.nextInt();
        System.out.print("Enter second numbers:");
        int n2= input.nextInt();
        System.out.print("now enter the operation:");
        String operation=input.next();

        int result=switch (operation){
            case "+"->n1+n2;
            case "-"->n1-n2;
            case "*"->n1*n2;
            case "/"->n1/n2;
            case "%"->n1%n2;
            default -> -1;
        };
        System.out.println("your answer is "+result);

    }
}
