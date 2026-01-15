package OOPS.Polymorphism;

// [NOTE]: Method call resolved at runtime
// Parent reference can hold child object

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class AnimalRuntimeTimePolymorphism_1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // compile time polymorphism (static binding)
        a.sound(); // Calls Dog's sound()
    }
}
