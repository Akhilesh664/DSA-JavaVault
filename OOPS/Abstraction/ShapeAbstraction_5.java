package OOPS.Abstraction;

//[NOTE]: Abstract class can provide default behavior
// Child overrides only required methods

abstract class Shape {
    abstract void draw();

    void message(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}


public class ShapeAbstraction_5 {

    public static void main(String[] args) {
        Shape s = new Circle(); // abstraction
        s.message();
        s.draw();
    }

}
