package Practise1;

import java.util.Scanner;

public class Emp {

    int empNo;
    String name;
    String designation;
    String dept;
    int salary;

    void readEmpData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter empNo, name, designation, dept, salary : ");
        this.empNo = s.nextInt();
        this.name = s.next();
        this.designation = s.next();
        this.dept = s.next();
        this.salary = s.nextInt();
    }


    void displayEmpData(){
        System.out.println("Emp : " +
                "empNo=" + empNo +
                ", name=" + name +
                ", designation=" + designation +
                ", dept=" + dept +
                ", salary=" + salary );
    }


    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        var emp1 = new Emp();
        emp1.readEmpData();
        emp1.displayEmpData();
        //System.out.println(emp1);
    }

}
