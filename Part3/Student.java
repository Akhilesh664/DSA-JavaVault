package Part3;

public class Student {

	String name;
	int rollNo;
	
	//default or no argument constructor
	Student(){
		this.name = "unknown";
		this.rollNo = -1;
	}
	
	// Parameterized constructor
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
	
	
	
	public static void main(String[] args) {
		Student student1 = new Student("Bob", 12);
        Student student2 = new Student();
        student1.display();
        student2.display();
	}
	
}
