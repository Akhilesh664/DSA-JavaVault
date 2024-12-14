package Extra;

public class Methods_42 {
	
	// constructor
	Methods_42() {
		System.out.println("parametrised constructor is called");
	}

	private static void staticMethod() {
		System.out.println("static method can be called without creating object");		
	}

	private void nonStaticMethods() {
		System.out.println("Non-static method can only be called by creating object");		
		
	}

	public static void main(String[] args)
	{
		staticMethod(); //no need to give class name before function
		Methods_42 object = new Methods_42();
		object.nonStaticMethods();

	}
}
