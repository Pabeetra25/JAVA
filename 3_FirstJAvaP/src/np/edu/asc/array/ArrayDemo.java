package np.edu.asc.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int num1[]={1,2,3,4};//allowed but not recommended
        int []num2={1,2,3,4};//allowed and recommended
        String[] names={"Asha","Bara","Chhaya","Daya","Eliza"};
        //access array elements
        System.out.println(names[1]);
        //replacing array elements
        names[1]="Beena";
        System.out.println(names[1]);

        String[] names2=new String[5];
        names2[1]="Sam";
        names2[3]="Radha";
        for(int index =0;index<names2.length;index++){
            System.out.println(names2[index]);
        }
        //for each loop
        // datatype/Classtype   loopVariable : arrayname
        for(int var:num1){
            System.out.println(var);
        }
        for(String var:names){
            System.out.println(var);
        }
    }
}
