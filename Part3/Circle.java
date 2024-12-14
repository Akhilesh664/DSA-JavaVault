package Part3;

public class Circle {
	
	double radius;

	// Parameterized constructor
	Circle(double radius) {
		this.radius = radius;
	}
	
	// copy constructor
	Circle (Circle c) {
		this.radius = c.radius;
	}
	

	public static void main(String[] args) {
		var circle1 = new Circle(7);
        var circle2 = new Circle(circle1);
        System.out.println("Circle2 radius (copied from Circle1): " + circle2.radius);

	}
}
