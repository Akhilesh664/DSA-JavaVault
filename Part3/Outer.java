package Part3;

public class Outer {
	
	public class Inner{
	
		void showMessage(){
			System.out.println("It is inner class.");
		}
	}
	
	public static void main(String[] args) {
	Outer out = new Outer();
	Outer.Inner in = out.new Inner();
	in.showMessage();
	
	}
}
