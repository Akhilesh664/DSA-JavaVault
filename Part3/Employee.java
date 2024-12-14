package Part3;

public class Employee {
	
	int id;
	String name = "akhil";
	static String companyName;
	
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	static void setCname(String company) {
		companyName = company;
	}
	
	void displayDetails() {
        System.out.println("Employee Id: " + id + ", Name: " + name + ", Company: " + companyName);
    }
	
	public static void main(String[] args) {
		
		Employee.setCname("tcs");
		var e1 = new Employee(101,"anil sharma");
		e1.displayDetails();
		
		var e2 = new Employee(102,"parul sharma");
		e2.displayDetails();
		
	}

}
