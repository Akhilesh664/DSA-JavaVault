package OOPS.Abstraction;

//[Note]: Cannot create object of abstract class
// Abstract class can have both abstract & concrete methods
// Reference of abstract type allowed

abstract class Animal{
    // abstract method
    abstract void sound();

    // concrete method
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

public class AnimalAbstraction_1 {

    public static void main(String[] args) {
        Animal a = new Dog(); // abstraction
        a.sound();
        a.sleep();

    }

}
