package np.edu.asc.exceptionhandling;
import  java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowNThrows {
    public static void main(String[] args) {
        int balance=500;
        int withdraw=1000;
        if (balance < withdraw){
            throw new ArithmeticException("insufficient balance");
        }
        ThrowNThrows obj=new ThrowNThrows();
        try {
            obj.readFile();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
    public void readFile() throws FileNotFoundException{
        FileInputStream fis=new FileInputStream(new File("apple.txt"));
    }
}
