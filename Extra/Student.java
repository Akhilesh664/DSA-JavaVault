package Extra;

public class Student extends Person{
	
	String schoolName;

	public Student(int id, String name, int age, String schoolName) {
		super(id, name, age);
		this.schoolName = schoolName;
	}

	@Override
	public void Walking(){
		System.out.println("student is walking");
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", schoolName= "+schoolName +"]";
	}

	
	public static void main(String[] args) {
		Student s1 = new Student(1, "anil", 25, "sps");
		s1.Walking();
		System.out.println(s1);
		
		Person p1 = new Person(1, "anil", 25);
		p1.Walking();
		System.out.println(p1);
	}
}
