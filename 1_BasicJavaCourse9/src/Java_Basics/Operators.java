package Java_Basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //1.Assignment operator
//        int num=7;
//        System.out.println(num);
//        int newNum=num;
//        System.out.println(newNum);
//        newNum=67;
//        System.out.println(newNum);
//        System.out.println(num);


        //2.Arithmetic operators
//        int a=98;
//        int b=7;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        double x=87;
//        double y=5;
//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
//        System.out.println(x%y);

//Order of operation(B O D M A S)
//        System.out.println(9-5*3+4/2);

        //unary operators-post-increment,pre-increment,post-decrement,pre-decrement//        int x=5;
//        int y=-x;
//        int z=-y;
//        int a=x++;
//        int b=++x;
//        int c=x--;
//        int d=--x;
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

   //Relational operator
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter your age:");
//        int age=input.nextInt();
//
//        if(age>=18){
//        System.out.println("You can Vote");}
//        else {
//            System.out.println("You can't vote");
//        }

        //Logical operator
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=input.nextInt();

        input.nextLine();

        System.out.print("Enter your nationality:");
        String nationality=input.nextLine();
        if(age>=18 && nationality.equals("Nepali")){
            System.out.println("can vote");
        }else{
            System.out.println("can not vote");
        }

  input.close();
    }
}
