package challenges.task3;

import java.util.Scanner;

public class FindPasswordChecker {
    public static void main(String[] args) {
        //to find password checker until a valid password is entered using do-while loop
        Scanner input=new Scanner(System.in);
        String password;
        do {
            System.out.println("enter the password:");
             password = input.next();
        }while (!isValidPassword(password));
        System.out.println("thanks for entering valid password");
    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;

    }
}
