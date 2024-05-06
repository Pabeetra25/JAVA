package programming_challenges.Task5.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        //c31.to check if the given array is sorted or not
        System.out.println("Welcome to Array Sorted checkpost\n");
        int[] numArr=ArrayUtility.inputArray();
        boolean isInc=isIncreasing(numArr);
        boolean isDec=isDecreasing(numArr);
        if(isInc||isDec){
            System.out.println("Your array is sorted.");
        }else{
            System.out.println("your array is not sorted");
        }
    }
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while (i< numArr.length){
            if(numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return  true;

    }
    public static boolean isIncreasing(int[] numArr){
        int i=1;
        while (i< numArr.length){
            if(numArr[i]<numArr[i-1]){
                 return false;
            }
            i++;
        }
        return  true;
    }
}
