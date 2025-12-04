package programming_challenges.task3;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //c11.determine if a number is odd or even
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println(num+ " is even number.");
        }else{
            System.out.println(num +" is odd number");
        }
    }
}
