package programming_challenges.Task5.Arrays;

public class ArrayPalindromeOrNot {
    public static void main(String[] args) {
        //c34.to check if the array is palindrome or not

        //ex..nitin,121,appa
        int[]numArr=ArrayUtility.inputArray();
        boolean isPalin=isPalindrome(numArr);
        if (isPalin){
            System.out.println("your array is palindrome.");
        }else{
            System.out.println("your array is not palindrome.");
        }

    }
    public static boolean isPalindrome(int[] numArr){
        for (int i=0;i< numArr.length/2;i++){
            if(numArr[i] != numArr[numArr.length-1-i]){
                return false;
            }
        }
       return true;
    }
}
