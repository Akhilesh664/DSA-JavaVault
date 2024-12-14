package Part3;

public class Engine {
	String type;
	int horsepower;
	
	Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
	
	void displayDetails() {
		System.out.println("Engine Type: " + type + ", Horsepower: " + horsepower);
	}

}
