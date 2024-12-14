package Extra;

public class StaticInstanceDifference_45 {
	
	public static void main(String[] args) 
	{
		display();
		StaticInstanceDifference_45 diff = new StaticInstanceDifference_45();
		diff.show();
	}

	void show() {
		System.out.println("Non-Static Calling");				
	}

	static void display() {
		System.out.println("Static Calling");		
	}

}
