package Part4;

public class Initializer {
	
	static int num;
	
	static{
		num = 30;
		System.out.println("Static block executed. Value: " + num);
	}

	public static void main(String[] args) {
//		System.out.println(num);// way
		System.out.println(Initializer.num);
	}
}
