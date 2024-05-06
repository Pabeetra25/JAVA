package challenges.task3;

import java.util.Scanner;

public class OccurrenceOfSpecificElement {
    public static void main(String[] args) {
  //using for each loop,to the occurrence of specific element
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to finding occurrences\n");
        int[] nums=ArrayUtility.inputArray();
        System.out.println("now ,enter the number you want to search:");
        int element=input.nextInt();
        int occ=countOccurrences(nums,element);
        System.out.println("your element was found " + occ +"times.");
    }
    public static int countOccurrences(int[] nums,int element){
        int occ=0;
        for (int num:nums) {
            if (num == element){
                occ++;
            }
        }
        return occ;
    }
}
