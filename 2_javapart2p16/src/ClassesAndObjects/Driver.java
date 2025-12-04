package ClassesAndObjects;

public class Driver {
    static int minAgeForDriving=18;
    String name;
    String dateOfLicense;
    public static void main(String[] args) {

//        Car myCar=new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

         Car audi=new Car("Red");
         Car thar=new Car();
//         audi.addFuel(8);
         audi.start().drive();
         thar.start().drive();
        System.out.println(audi.color);
        System.out.println(thar.color);

//         Driver myDriver=new Driver();
//        myDriver.dateOfLicense="1/jan/2024";
//        System.out.println(minAgeForDriving);
    }
}
