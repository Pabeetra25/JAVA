package programming_challenges.Task5.Arrays;

public class SunOfTwoDiagonalElements {
    public static void main(String[] args) {
        //c38.to find sum of two diagonal elements
        //number of rows=number of columns
        int[][] numArr =ArrayUtility.input2DArray();
        long sum=sumOfDiagonal(numArr);
        System.out.println("Sum of diagonal is :" +sum);
    }

    public static long sumOfDiagonal(int[][] numArr) {
        long LeftSum=sumOfLeftDiagonal(numArr);
        long rightSum=sumORightDiagonal(numArr);
        long sum=LeftSum+rightSum;
        if(numArr.length % 2 !=0){
            int ind= numArr.length/2;
            sum -=numArr[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr) {
     long sum=0;
     int i=0;
     while (i< numArr.length){
         sum+=numArr[i][i];
         i++;
     }
     return sum;
    }
    public static long sumORightDiagonal(int[][] numArr) {
        long sum=0;
        int i=0;
        while (i< numArr.length){
            int col= numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;

    }
}
