package Part4;

public class Counter {

	static int count;
	
	Counter(){
		count++;
	}
	
	public static void main(String[] args) {
		var t1 = new Counter();	
		System.out.println(count);
		
		var t2 = new Counter();	
		System.out.println(count);
	}
	
}
