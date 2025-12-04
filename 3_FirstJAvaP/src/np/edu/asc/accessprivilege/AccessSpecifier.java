package np.edu.asc.accessprivilege;

public class AccessSpecifier {
public int varPublic=10;
int varDefault=10;//default access modifier
    protected int varprotected=10;
    private  int varPrivate=101;
    public int getPrivateVaraible(){
        return varPrivate;

    }

    public static void main(String[] args) {
        AccessSpecifier as=new AccessSpecifier();
        System.out.println(as.varPublic);
        System.out.println(as.varDefault);
        System.out.println(as.varprotected);
        System.out.println(as.varPrivate);
    }
}
class Test{
    public static void main(String[] args) {
        AccessSpecifier as=new AccessSpecifier();
        System.out.println(as.varPublic);
        System.out.println(as.varDefault);
        System.out.println(as.varprotected);
        //System.out.println(as.varPrivate);//can access only with in the class
        System.out.println(as.getPrivateVaraible());//can access with the help of public method
    }
}
