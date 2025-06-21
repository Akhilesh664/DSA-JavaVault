package Extra;

public class StaticInstanceDifference_45 {

	void show() {
		System.out.println("Non-Static Calling");				
	}

	static void display() {
		System.out.println("Static Calling");		
	}

	public static void main(String[] args) {
		display();
		StaticInstanceDifference_45 diff = new StaticInstanceDifference_45();
		diff.show();
	}
}
