package OOPS.Polymorphism;

// [NOTE]: super helps reuse parent logic
// Clean override implementation

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        super.draw();
        System.out.println("Drawing circle");
    }
}

public class ShapePolymorphism_5 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
