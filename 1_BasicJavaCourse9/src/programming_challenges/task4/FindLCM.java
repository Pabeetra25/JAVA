package programming_challenges.task4;

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        //c20.find LCM of two numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int firstNum=input.nextInt();
        System.out.println("Enter the  number:");
        int SecondNum=input.nextInt();

        int lcm=lcm(firstNum,SecondNum);
        System.out.println("LCM of two numbers is :" +lcm);


    }
    public static int lcm(int first,int second){
     int i=1;
     //while(i<=second)
     while ( true){
         int factor=first*i;
         if(factor % second == 0){
             return factor;
         }
         i++;
     }
     //return 0;
    }

}
