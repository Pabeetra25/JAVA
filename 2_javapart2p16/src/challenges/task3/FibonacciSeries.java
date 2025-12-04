package challenges.task3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //using recursion to display fibonacci series up to certain number
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of elements to be printed");
        int count =input.nextInt();
        for (int i=1;i<=count;i++){
            System.out.println(fibonacci(i)+ " ");
        }
    }
    public static int fibonacci(int position){
     if (position == 1){
         return 0;
     }
     if (position ==2){
         return 1;
     }
     return fibonacci(position-1)+fibonacci(position-2);
    }
}
