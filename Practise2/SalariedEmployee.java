// 2st cdac java assignment 2

package Practise2;

public class SalariedEmployee extends Employee{

    private double Salary;

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public SalariedEmployee(long ssn, String fname, String lname, double sal) {
        super(ssn, fname, lname);
        this.Salary = sal;
    }
    //Long ssn, String fname, String lname,  // check

    public double computeGrossPay(){
        return Salary * 12;
    }

    public double computeNetPay(){
        return computeGrossPay() * 0.9;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Salary : " + Salary);
    }



}
