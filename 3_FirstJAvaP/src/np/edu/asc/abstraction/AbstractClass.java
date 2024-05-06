package np.edu.asc.abstraction;

public  abstract class AbstractClass {

public void method1(){//declaration
    System.out.println("method 1");//definition
}

public abstract void withdraw();//only declaration
    public abstract  void passChange();

    //abstract class may or may not contain abstract method
    //but abstract method must always be contained within an abstract class
    public static void main(String[] args) {
        System.out.println("Hello");
      //  AbstractClass ac=new AbstractClass() ;//cause object can be created

    }
}
