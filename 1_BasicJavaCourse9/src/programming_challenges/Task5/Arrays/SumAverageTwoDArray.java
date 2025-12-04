package programming_challenges.Task5.Arrays;

public class SumAverageTwoDArray {
    public static void main(String[] args) {
        //c37 to do sum and average of all elements in 2D array
        int[][]numArr=ArrayUtility.input2DArray();
        long sum=sum(numArr);
        double avg=average(numArr);
        System.out.println("your sum of array is "+sum);
        System.out.println("your average of array is "+avg);

    }
    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }
         int rows= numArr.length;
         int cols=numArr[0].length;
         double size=rows*cols;
         return sum(numArr)/size;
    }
    public static long sum(int[][] numArr){
        long sum=0;
        int i=0;
        while (i< numArr.length){
            int j=0;
            while (j<numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;
        }
       return sum;
    }
}
