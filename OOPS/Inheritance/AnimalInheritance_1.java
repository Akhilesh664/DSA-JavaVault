package OOPS.Inheritance;

// [NOTE]: Child automatically gets parent behavior
// Represents IS-A relationship

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class AnimalInheritance_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();  // own
    }
}
