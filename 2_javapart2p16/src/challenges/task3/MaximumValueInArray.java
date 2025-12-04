package challenges.task3;

public class MaximumValueInArray {
    public static void main(String[] args) {
   //using for each to find maximum integer in an array
        System.out.println("welcome to finding the maximum\n");
            int[] arr=ArrayUtility.inputArray();
         int max=Integer.MIN_VALUE;
        for (int num:arr) {
            if (max<num){
                max=num;
            }
        }
        System.out.println("Maximum number is :"+max);
    }
}
