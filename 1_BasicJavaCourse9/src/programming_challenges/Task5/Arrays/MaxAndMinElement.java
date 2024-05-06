package programming_challenges.Task5.Arrays;

import java.util.Scanner;

public class MaxAndMinElement {
    public static void main(String[] args) {
        //c30.to find the maximum and minimum element in an array
        System.out.println("Welcome to Max  and Min\n");
        int[]numArr=ArrayUtility.inputArray();
        int max=max(numArr);
        int min=min(numArr);
        System.out.println("Max of the array is "+max);
        System.out.println("Min of the array is "+min);
    }
    public static int min(int[] numArray){
        int min=Integer.MAX_VALUE;
        int i=0;
        while (i<numArray.length){
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
  return min;
    }
    public static int max(int[] numArray){
          if(numArray.length ==0){
              return  Integer.MIN_VALUE;
          }
          int max=numArray[0];
          int i=1;
          while(i< numArray.length){
              if(max<numArray[i]){
                  max=numArray[i];
              }
              i++;
          }
          return max;
    }
}
