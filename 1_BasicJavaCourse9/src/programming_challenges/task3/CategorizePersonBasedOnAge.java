package programming_challenges.task3;

import java.util.Scanner;

public class CategorizePersonBasedOnAge {
    public static void main(String[] args) {
        //c15:categorize person into different age group
        Scanner input=new Scanner(System.in);
        System.out.println("Enter age of the person:");
        int age=input.nextInt();
        if(age<13){
            System.out.println("Person is child as his/her age is just "+age);
        }else if(age >= 13 && age<20){
            System.out.println("person falls into teen category");
        } else if (age>=20 && age<60) {
            System.out.println("Falls under Adult category");
        }
        else{
            System.out.println("Senior");
        }
    }
}
