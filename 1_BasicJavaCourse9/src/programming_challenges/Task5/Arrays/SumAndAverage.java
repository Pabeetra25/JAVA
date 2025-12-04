package programming_challenges.Task5.Arrays;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        //c28.to find sum and average of all elements in an array


        System.out.println("Welcome to array sum and average");
        int[] numArray=ArrayUtility.inputArray();
        long sum=sum(numArray);
        double avg=Average(numArray);
        System.out.println("Sum of an array is "+sum);
        System.out.println("Average of an array is "+avg);

    }
    public static  long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }
    public static double Average(int[] numArray){
        double sum=sum(numArray);
        return (sum/ numArray.length);
    }
}
