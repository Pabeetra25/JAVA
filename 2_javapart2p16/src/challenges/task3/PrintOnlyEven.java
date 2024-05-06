package challenges.task3;

import java.util.Scanner;

public class PrintOnlyEven {
    public static void main(String[] args) {
        //using continue to print only even numbers
       for (int i=1;i<=100;i++){
           if(i % 2 !=0){
               continue;
           }
           System.out.println(i);
       }
        }
}
