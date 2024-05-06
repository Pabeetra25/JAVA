package programming_challenges.task4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //c18.calculate the factorial of given number
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the number :");
//        int n=input.nextInt();
         int result=fact(13);
        System.out.println(result);

    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            return n*fact(n-1);
        }
    }
}
