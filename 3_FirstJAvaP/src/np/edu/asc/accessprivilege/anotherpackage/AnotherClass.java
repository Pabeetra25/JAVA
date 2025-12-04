package np.edu.asc.accessprivilege.anotherpackage;
import np.edu.asc.accessprivilege.AccessSpecifier;
public class AnotherClass extends AccessSpecifier{
    public static void main(String[] args) {
        AccessSpecifier as=new AccessSpecifier();
        System.out.println(as.varPublic);
        //System.out.println(as.varDefault);//error cause default access specifier scope is  only with in same package

        //System.out.println(as.varProtected);//can call through inheritance(child class) only
        AnotherClass ac=new AnotherClass();
        System.out.println(ac.varprotected);
        //System.out.println(as.varPrivate);
    }
}
