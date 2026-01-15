package OOPS.Abstraction;

//[Note]: Abstract classes CAN have constructors
// Constructor executes when subclass object is created

abstract class Vehicle{

    // constructor
    Vehicle(){
        System.out.println("Vehicle constructor called");
    }

    // abstract method
    abstract void run();

}

class Car extends Vehicle{
    // method
    void run(){
        System.out.println("Car is Running");
    }
}


public class VehicleAbstraction_2 {
    public static void main(String[] args) {
        Vehicle v = new Car(); // abstraction
        v.run();
    }
}
