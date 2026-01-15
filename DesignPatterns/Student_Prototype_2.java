package DesignPatterns;

public class Student_Prototype_2 implements Cloneable{

    String name;
    int rollNo;

    public Student_Prototype_2(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // Override the clone method
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student_Prototype_2 s1 = new Student_Prototype_2("Alice", 20);
            Student_Prototype_2 s2 = (Student_Prototype_2) s1.clone(); // clone() makes a copy

            System.out.println(s1 == s2); // false (different objects)
            System.out.println(s1.name.equals(s2.name)); // true (same data)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
