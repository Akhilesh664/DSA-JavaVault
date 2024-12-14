package Part3;

public class Car {

	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}


	void disp() {
		System.out.println(make +" "+ model +" "+year);
	}

	public static void main(String[] args) {
		
		Car car = new Car("BMW", "Q4", 2015); // object instance
		car.disp();
		System.out.println(car);
	}
}
