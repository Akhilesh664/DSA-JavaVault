package Practise2;

// Uses Animal, Dog, and Cat classes to demonstrate inheritance
public class animalMain {

    public static void main(String[] args) {
        var d1 = new Dog();
        d1.makeSound();

        var c1 = new Cat();
        c1.makeSound();

        // it can be done like this
        Animal a1 = new Animal();
        a1.makeSound();

//        // it cant be done like this as Animal [parent class] is not an instance of cat [child class]
//        cat c2 = new Animal();
//        c2.makeSound();

//        // it can be done like this [but it can access only Animal methods]
//        Animal a2 = new cat();
//        a2.makeSound();
    }

}
