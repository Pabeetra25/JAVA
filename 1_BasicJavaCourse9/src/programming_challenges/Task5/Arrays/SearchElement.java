package programming_challenges.Task5.Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        //c36 to search element in 2D array
        System.out.println("welcome to 2D search\n");
        Scanner input=new Scanner(System.in);
        int[][]numArr=ArrayUtility.input2DArray();
        System.out.println("Now enter the number you want to search ");
        int num= input.nextInt();
        boolean isFound=search(numArr,num);
        if (isFound){
            System.out.println("your number was found.");
        }else{
            System.out.println("your number was not found.");
        }
    }
    public static  boolean search(int[][] numArr,int num){
       int i=0;
       while (i<numArr.length){
           int j=0;
           while (j<numArr[i].length){
               if(numArr[i][j] == num){
                   return true;
               }
               j++;
           }
           i++;
       }
       return false;
    }
}
