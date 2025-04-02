package Java_8;

//💡 Default methods: allows default and static methods inside interfaces.
//💡 Uses: Default methods allow adding new methods in interfaces without breaking existing implementations. In a payment gateway system,-
// -you can introduce a new tax calculation method in an interface without modifying old classes

interface Vehicle {
    default void start(){
        System.out.println("Vehicle is starting...");
    }

    static void stop(){
        System.out.println("Vehicle is stopping...");
    }
}

class Car implements Vehicle {
}

public class DefaultMethodExample_3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();// calls default method
        Vehicle.stop(); // calls static method without instance creation
    }
}
