package Java_Basics;

public class Array {
    public static void main(String[] args) {
//        int[] myArr=new int[5];
//        myArr[0]=78;
//        myArr[1]=8;
//        myArr[2]=7;
//        myArr[3]=18;
//        myArr[4]=68;

        int[] myArr={23,33,65,23,6};

//       array traversal
        int index=0;
        while(index< myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
        String [] arr=new String[4];
        arr[0]="Pabeetra";
        arr[0]="Paetra";
        arr[0]="Patra";
        System.out.println(arr.length);
    }
}
