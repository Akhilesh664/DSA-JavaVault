package OOPS.Inheritance;

// [NOTE]: final methods cannot be overridden
// Used for security & stability

class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void show() { } ❌ Compile-time error
}

public class ParentInheritance_5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
