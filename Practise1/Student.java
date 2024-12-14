package Practise1;

public class Student {
    // Data members
    int id;
    String name;
    int marks;
    String result;

// Method to initialize the values of id, name, and marks
void readData(int studentId, String studentName, int studentMarks) {
//    this.id = studentId;
//    this.name = studentName;
//    this.marks = studentMarks;

    id = studentId;
    name = studentName;
    marks = studentMarks;

}

// Method to calculate and assign the result based on marks
void computeResult() {
    if (marks >= 50) {
        result = "Pass";
    } else {
        result = "Fail";
    }
}

// Method to display student details
void showData() {
    System.out.println("Student ID: " + id);
    System.out.println("Student Name: " + name);
    System.out.println("Student Marks: " + marks);
    System.out.println("Student Result: " + result);
}

    // Main method to test the program
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student();

        // Initialize student data
        student.readData(1, "John Doe", 75);

        // Calculate the result
        student.computeResult();

        // Display the student details
        student.showData();

//        student.readData(2, "anil", 23); // Will update same object
//
//        // Calculate the result
//        student.computeResult();
//
//        // Display the student details
//        student.showData();

    }
}
