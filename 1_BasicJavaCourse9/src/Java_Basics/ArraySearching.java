package Java_Basics;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr={3,4,6,7,3,7,5,5,67,44,32,23};
        System.out.println("Welcome to array searching\n");
        System.out.println("Enter thee number you want to search: ");
        int num=input.nextInt();
        boolean isFound=isFound(arr,num);
       if( isFound){
            System.out.println("Number found in the array");
        }else {
           System.out.println("number not found in the array");
       }
    }
    public static boolean isFound(int[] arr,int num){
         int index=0;
         while (index< arr.length){
             if(arr[index]==num){
                 return true;
             }
             index++;
         }
         return  false;
    }
}
