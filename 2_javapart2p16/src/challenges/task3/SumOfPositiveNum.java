package challenges.task3;

import java.util.Scanner;

public class SumOfPositiveNum {
    public static void main(String[] args) {
        //using continue to sum all positive numbers entered by user;skip any negative numbers
        Scanner input=new Scanner(System.in);
        int[] numArr=ArrayUtility.inputArray();
        int sum=0;
        for (int num:numArr) {
            if (num<0){
                continue;
        }
            sum+=num;
        }
        System.out.println("sum of positive numbers is "+sum);
    }
}
