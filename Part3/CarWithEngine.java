package Part3;

public class CarWithEngine {
	
	String model;
	Engine engine;
	
	CarWithEngine(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	void displayEngineDetails(){
		System.out.println("model : "+ model);
		engine.displayDetails();
	}
	
	
	public static void main(String[] args) {
		Engine engine = new Engine("turbo", 600);
		CarWithEngine car1 = new CarWithEngine("EP2017",engine);
		car1.displayEngineDetails();
		
	}
	

}
