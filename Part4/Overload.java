package Part4;

public class Overload {
	
	static void print(int number){
		System.out.println(number);
	}
	
	static void print(String text){
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		
		Overload.print(23);
		
		Overload.print("hello");
	}
	
}
