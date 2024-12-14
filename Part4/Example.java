package Part4;

public class Example {

	int num1 = 5; // non-static
	
	static int num2 = 10;// static 
	
	void nonStaticFunction(){ // non-Static function can access static/non-static variable.
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
	}

	static void staticFunction(){ // Static function can only access static variable.
//		System.out.println("Num1 : "+num1); // cannot access
		System.out.println("Num2 : "+num2);
	}
	
	
	public static void main(String[] args) {
		// Accessing non static function
		System.out.println("non-static function call");
		var ex1 = new Example();
		ex1.nonStaticFunction();
		
		System.out.println("=============");
		System.out.println("static function call");		
		// Accessing static function
		Example.staticFunction();
		
	}
	
}
