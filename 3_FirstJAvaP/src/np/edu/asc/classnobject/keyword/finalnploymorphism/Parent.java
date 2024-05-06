package np.edu.asc.classnobject.keyword.finalnploymorphism;

public class Parent {
public double area(double r){//overload for same class level
    return  Math.PI*r*r;
}
public  double area(double l,double b){//overload for same class level
    return l*b;
}

    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.area(10.0));
        System.out.println(p.area(10.0,20.0));
    }
}
