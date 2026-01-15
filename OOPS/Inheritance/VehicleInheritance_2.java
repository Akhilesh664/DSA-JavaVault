package OOPS.Inheritance;

// [NOTE]: Child inherits from multiple levels
// Java supports multilevel inheritance

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car charging");
    }
}

public class VehicleInheritance_2 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();
    }
}
