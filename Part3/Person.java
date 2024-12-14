package Part3;

public class Person {

	String name;
	int age;
	
	void disp() {
		System.out.println(name +" "+ age);
	}	
//}


//public class test1{
	public static void main(String[] args) {
		
		Person person = new Person(); // object instance
		person.name = "akhil";
		person.age = 23;
		person.disp();
		
		
	}
}
