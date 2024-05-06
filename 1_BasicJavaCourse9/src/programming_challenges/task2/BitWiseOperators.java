package programming_challenges.task2;

import java.util.Scanner;

public class BitWiseOperators {
    public static void main(String[] args) {
        //c16
        //Shows 'bitwise AND' of two numbers
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=input.nextInt();
        System.out.print("Enter second number:");
        int n2=input.nextInt();
//        int bAnd=n1&n2;
//        System.out.println("bitwise And of "+n1 +" and "+n2+"is :"+ bAnd);

        //bitwise OR
//        int bOr=n1|n2;
//        System.out.println("bitwise OR of "+n1 +" and "+n2+" is : "+ bOr);

        //bitwise XOR
//        int bXor=n1^n2;
//        System.out.println("bitwise XOR of "+n1 +" and "+n2+" is : "+ bXor);

        //bitwise compliment
//        int bCompliment=~n1;
//        System.out.println("bitwise compliment of "+n1+ "is "+bCompliment);

        //left shift operator
//        int result=n1<<1;
//        System.out.println("result is "+result);
        //right shift operator
        int result=n1>>1;
   System.out.println("result is "+result);
    }
}
