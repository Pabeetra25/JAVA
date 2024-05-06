package programming_challenges.Task5.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //c33.to reverse an array
        System.out.println("welcome to array reversing\n");
        int[]numArr=ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("your reverse array is");
        ArrayUtility.displayArray(numArr);
    }
    public static void reverse(int[] arr){
        for (int i=0;i< arr.length/2;i++){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
        }

    }
}
