package np.edu.asc.abstraction;

public class ChildOfAbstract extends AbstractClass{
    @Override
    public  void withdraw(){//declaration
        System.out.println("Method 2");//definition

    }
    @Override
    public void passChange(){
        System.out.println("method3");
    }
    public static void main(String[] args) {
        ChildOfAbstract coa=new ChildOfAbstract();
        coa.method1();
        coa.withdraw();
        coa.passChange();
    }
}
