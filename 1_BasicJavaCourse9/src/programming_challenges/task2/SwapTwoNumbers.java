package programming_challenges.task2;
//challenge number3
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int n1=3;
        int n2=5;
        System.out.println("Before Swapping");
        System.out.println("First number is : "+n1);
        System.out.println("Second number is : "+n2);

        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After Swapping");
        System.out.println("First number is : "+n1);
        System.out.println("Second number is : "+n2);



    }
}
