package Part4;

import static java.lang.Math.*;

public class StaticImportExample {

	public static void main(String[] args) {
		System.out.println("square root of 16: "+sqrt(16));
		System.out.println("PI value: "+PI);
		// static import to call Math methods directly without class reference.
	}
}
