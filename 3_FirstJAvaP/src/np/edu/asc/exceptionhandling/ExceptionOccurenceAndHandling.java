package np.edu.asc.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionOccurenceAndHandling {
    public static void main(String[] args) {
        System.out.println("apple");
        System.out.println("ball");
        try {
            FileInputStream fis = new FileInputStream("fis.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e){
                System.out.println(e);
            }finally {
                System.out.println("Thank u for using the calculator");
            }



    }
}
