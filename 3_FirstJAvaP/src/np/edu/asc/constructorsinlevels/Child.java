package np.edu.asc.constructorsinlevels;

public class Child extends Parent{
    public Child(){
        //super();
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child c=new Child();
    }

}
