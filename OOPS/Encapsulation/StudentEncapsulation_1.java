package OOPS.Encapsulation;

// [NOTE]: Data is protected from invalid values
// Encapsulation = private variables + public methods

class Student {
    private int marks;

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        }else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentEncapsulation_1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(86);
        System.out.println(s1.getMarks());
    }
}
