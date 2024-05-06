package challenges.task3;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        //using break to read inputs from the user in a loop and break the loop if keyword("exit"is entered
        Scanner input=new Scanner(System.in);
        System.out.println("enter the keyword you want");
        while(true){
            System.out.println("Enter your command:");
            String command=input.next();
            if (command.equals("exit")){
                break;
            }
        }
        System.out.println("successfully exited");
    }
}
