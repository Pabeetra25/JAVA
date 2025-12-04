package challenges.task3;

import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string");
        String word =input.next();
        System.out.println("Your string is " +
                (isPalindrome(word)? "palindrome":
                        "Not Palindrome"));
    }
    public static boolean isPalindrome(String str){
        if (str.length() <=1){
            return true;
        }
        int lastPos=str.length() -1;
        if (str.charAt(0) !=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
