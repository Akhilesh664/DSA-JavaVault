package Part3;

public class Rectangle {
	
	int length;
	int width;
	
	int CalculatedArea(int l, int w){
		return l * w;
	}
	
	void disp() {
		System.out.println("length: "+ length +", width: "+ width);
	}	



	public static void main(String[] args) {
		
		var r1 = new Rectangle(); // object instance
		r1.length = 34;
		r1.width = 20;
		r1.disp();
		System.out.println((r1.CalculatedArea(r1.length, r1.width)));
		
	}
}

