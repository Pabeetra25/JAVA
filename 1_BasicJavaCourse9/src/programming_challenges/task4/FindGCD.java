package programming_challenges.task4;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        //c21 find GCD of two numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int firstNum=input.nextInt();
        System.out.println("Enter the  number:");
        int SecondNum=input.nextInt();

        int gcd=gcd(firstNum,SecondNum);
        System.out.println("GCD of two numbers is :" +gcd);
    }
    public static int gcd(int first,int second){
          int gcd=1;
          int i=2;
          int least=least(first,second);
          while (i<=least){
              if(first % i == 0 && second % i == 0){
                  gcd=i;
              }
              i++;
          }
        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return  num1;
        }
        else{
            return num2;
        }
    }
}
