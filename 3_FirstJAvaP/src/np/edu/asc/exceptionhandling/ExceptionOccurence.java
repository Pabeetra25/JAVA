package np.edu.asc.exceptionhandling;

public class ExceptionOccurence {
    public static void main(String[] args) {
        System.out.println("Albert");
        System.out.println("Bella");
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("you can't  divide by zero");
        }finally {
            System.out.println("i will be executed anyway");
        }
        System.out.println("Catherine");
        System.out.println("Donald");
    }
}
