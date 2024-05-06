package programming_challenges.Task5.Arrays;

import java.util.Scanner;

public class FindNumOfOccurrence {
    public static void main(String[] args) {
        //c29.to find the number of occurrences of an elements in an array
        Scanner input=new Scanner(System.in);
        int[]numArr=ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find:");
        int num= input.nextInt();
        int occurrences=noOfOccurrence(numArr,num);
        System.out.println("Your element was found "+occurrences +" times in the array");
    }
    public static int noOfOccurrence(int[] numArr , int num){
      int occ=0;
      int i=0;
      while(i<numArr.length){
          if(numArr[i] ==num){
              occ++;
          }
          i++;
      }
      return occ;
    }
}
