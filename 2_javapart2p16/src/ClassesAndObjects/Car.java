package ClassesAndObjects;

public class Car {

    static  int noOfCarsSold;
//instance variable
        int noOfWheel;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        static {
            noOfCarsSold=0;
            System.out.println("i am in static block");
        }
        {
            noOfCarsSold++;
            System.out.println("i am in Initialization block");
        }

        //constructor
    Car(String carColor){
        noOfWheel=4;
       this. color=carColor;
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }
    Car(){
        this("Black");
        currentFuelInLiters=6;
    }

//instance method
    public Car start(){
        if(currentFuelInLiters ==0){
            System.out.println("Car is out of fuel,can not start");
        } else if (currentFuelInLiters <5) {
            System.out.println("car is in reserved mode,please refuel");
        }else{
            System.out.println("Car is started...bruuhhhhhh....");
        }
        return this;
    }
    public  void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving");
       }
    public void addFuel(float currentFuelInLiters){
       this.currentFuelInLiters +=currentFuelInLiters;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }



}
