package OOPS.Inheritance;

// [NOTE]: Parent constructor runs before child
// super() is implicit if not written

class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Employee extends Person {
    Employee() {
        super(); // optional, added by compiler
        System.out.println("Employee constructor");
    }
}

public class PersonInheritance_4 {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
