package np.edu.asc.classnobject.nestedinnerclass;

public class Outer {
    int outerVar=10;
    class Inner{
        public  void innerMethod() {
            System.out.println("hello from inner method");
        }
    }
    public void getInnerMethod(){
        Inner in=new Inner();
        in.innerMethod();
    }
}
class BahirakoClass{
    public static void main(String[] args) {
        Outer out=new Outer();
        out.getInnerMethod();
        
    }
}
