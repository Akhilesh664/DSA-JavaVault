package Part3;
public class Student {

	String name;
	int rollNo;

	// ✅ 1. Default (No-Argument) Constructor
	// Initializes with default values
	Student() {
		this.name = "unknown";
		this.rollNo = -1;
	}

	// ✅ 2. Parameterized Constructor
	// Allows custom initialization
	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	// ✅ 3. Copy Constructor
	// Creates a new object by copying fields from another object
	Student(Student s) {
		this.name = s.name;
		this.rollNo = s.rollNo;
	}

	// ✅ 4. Overloaded Constructor (different parameters)
	// Example: Only name provided, rollNo defaults to 0
	Student(String name) {
		this.name = name;
		this.rollNo = 0; // default roll number
	}

	// ✅ 5. Overloaded Constructor (different parameter types)
	// Example: roll number provided, name defaults
	Student(int rollNo) {
		this.name = "unknown";
		this.rollNo = rollNo;
	}

	// Method to display student details
	void display() {
		System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
	}

	public static void main(String[] args) {
		// Using Parameterized Constructor
		Student student1 = new Student("Bob", 12);

		// Using Default Constructor
		Student student2 = new Student();

		// Using Copy Constructor (cloning student1)
		Student student3 = new Student(student1);

		// Using Overloaded Constructor (only name)
		Student student4 = new Student("Alice");

		// Using Overloaded Constructor (only roll number)
		Student student5 = new Student(101);

		// Display all students
		student1.display(); // Student Name: Bob, Roll No: 12
		student2.display(); // Student Name: unknown, Roll No: -1
		student3.display(); // Student Name: Bob, Roll No: 12
		student4.display(); // Student Name: Alice, Roll No: 0
		student5.display(); // Student Name: unknown, Roll No: 101
	}
}

