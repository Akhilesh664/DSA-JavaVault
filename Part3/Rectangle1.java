package Part3;

public class Rectangle1 {
	
	int length;
	int width;
	
	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int CalculatedArea(int l, int w){
		return l * w;
	}
	
	void disp() {
		System.out.println("length: "+ length +", width: "+ width);
	}	
	
	Rectangle1 combine(Rectangle1 r1) {
		 int newLength = this.length + r1.length;
	     int newWidth = this.width + r1.width;
	     return new Rectangle1(newLength, newWidth);
		
	} 



	public static void main(String[] args) {
		
		var r1 = new Rectangle1(45,28); // object instance
//		r1.disp();
		var r2 = new Rectangle1(23,10); // object instance
		r2.disp();

		System.out.println((r1.CalculatedArea(r1.length, r1.width)));
		Rectangle1 combinedRect = r1.combine(r2);
	    System.out.println("Combined Rectangle Area: " + combinedRect.CalculatedArea(r1.length, r1.width));

		
	}
}


