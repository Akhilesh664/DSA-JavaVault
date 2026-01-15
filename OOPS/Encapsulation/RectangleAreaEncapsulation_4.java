package OOPS.Encapsulation;

// [NOTE]: User doesn’t know how area is calculated
// Only uses public behavior
class Reactangle {
    private int length;
    private int breadth;

    public Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class RectangleAreaEncapsulation_4 {
    public static void main(String[] args) {
        Reactangle r = new Reactangle(10, 20);
        System.out.println(r.area());
    }
}
