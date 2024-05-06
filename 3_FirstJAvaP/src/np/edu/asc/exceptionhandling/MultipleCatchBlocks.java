package np.edu.asc.exceptionhandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String[]a={"apple"};
        try{
            System.out.println(10/0);
            System.out.println(a[2]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
