package Part4;

public class Outer {
	public class Nested{
		void display(){
			System.out.println("Message from nested class.");
		}
	} 
	
	public static void main(String[] args) {
		var out = new Outer();
		var nest = out.new Nested();
		nest.display();
		
//		Outer.Nested nested = Outer.new Nested();
//		nested.display();
	}

}
