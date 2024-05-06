package np.edu.asc.classnobject.inheritance.multilevel;

public class GrandChild  extends Child{
    int propertyG=100000;

    public static void main(String[] args) {
        GrandChild gc=new GrandChild();
        System.out.println(gc.propertyG);
        System.out.println(gc.propertyC);
        System.out.println(gc.propertyP);

    }
}
