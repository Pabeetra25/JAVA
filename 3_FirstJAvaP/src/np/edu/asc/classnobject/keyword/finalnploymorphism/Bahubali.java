package np.edu.asc.classnobject.keyword.finalnploymorphism;

public class Bahubali extends Shivgami{
    final int A =12;
    final double PI=3.14;
    @Override
    public void gift(){
        System.out.println("devsena");
       // super.gift();
    }
    /*public void gift(int a){
        System.out.println("blah blah");
    }  */

    public static void main(String[] args) {
        final int C;//c becomes constant
        //once assigned any value,that variable becomes constant
        C=34;
       // c=25;//throw error
        Bahubali b=new Bahubali();
        b.gift();

    }
}
