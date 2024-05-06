package controlStatements.Maths.string;

public class JavaMaths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-98));
        System.out.println(Math.ceil(4.3));
        System.out.println(Math.floor(4.3));
        System.out.println(Math.round(4.3));
        System.out.println(Math.PI);

        for (int i=0;i<10;i++){
           int random=(int)Math.round(Math.random() *100);
            System.out.println(random);
        }
    }
}
