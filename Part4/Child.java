package Part4;

public class Child extends Parent{
	
	static void show(){	
		System.out.println("message from child show()");
	}
	
	public static void main(String[] args) {
		
		Parent.show();
		Child.show();

		Parent p = new Child();
//		p.show();// This will call Parent's show() because static methods are not overridden.
	}
}

