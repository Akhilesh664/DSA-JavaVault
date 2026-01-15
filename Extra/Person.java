package Extra;

public class Person {
	
	int id; 
	String name;
	int age;
	
	public void Walking(){
		System.out.println("person is walking");
	}
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {

		var p1 = new Person(1,"anil",23);
		System.out.println(p1);
		p1.Walking();
 	}
	
	
}
