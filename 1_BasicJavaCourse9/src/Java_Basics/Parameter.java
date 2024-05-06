package Java_Basics;

public class Parameter {
    public static void main(String[] args) {
        //int num=sumTwoNumbers(3,89);//argument
        System.out.println(sumTwoNumbers(3,89));
        System.out.println(sumTwoNumbers(31,89));
        System.out.println(sumTwoNumbers(1,9));


    }
    public static int sumTwoNumbers(int first,int second){//parameter
        System.out.println("first number received is "+first);
        System.out.println("second number received is "+second);
        return first+second;

    }
}
