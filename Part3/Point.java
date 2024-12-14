package Part3;

public class Point {
	
	int x,y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double distance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)); 
	}
	
	
	public static void main(String[] args) {
		
		var p1 = new Point(2,3);
		var p2 = new Point(6,8);
		
		System.out.print("distance between p1, p2: "+p1.distance(p2));
		
		
	}
	
	
	

}
