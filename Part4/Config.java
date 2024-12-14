package Part4;

public class Config {
	
	static int ConfigNum ;
	
	static {
		ConfigNum = 10;
        System.out.println("Static block executed. ConfigNum: " + ConfigNum);
        // the static block runs before the main method
	} 

	public static void main(String[] args) {
	        System.out.println("Main method. ConfigNum: " + ConfigNum);
	}
}
