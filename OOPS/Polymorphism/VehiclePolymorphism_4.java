package OOPS.Polymorphism;

// [NOTE]: Overridden methods are accessible
// Child-specific methods are hidden

class Vehicle {
    void speed() {
        System.out.println("Vehicle speed");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 120 km/h");
    }

    void fuelType() {
        System.out.println("Petrol");
    }
}

public class VehiclePolymorphism_4 {
    public static void main(String[] args) {
        Vehicle v = new Car(); // Upcasting
        v.speed();            // Calls Car's speed()

        // v.fuelType(); ❌ Compile-time error
    }
}
