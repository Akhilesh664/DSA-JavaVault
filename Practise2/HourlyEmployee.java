// 2st cdac java assignment 2

package Practise2;

public class HourlyEmployee extends Employee{

    private Double Salary;

    public HourlyEmployee(long ssn, String fname, String lname, double sal) {
        super(ssn, fname, lname);
        this.Salary = sal;
    }
    //Long ssn, String fname, String lname,  // check

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public double computeGrossPay(){
        return Salary * 12;
    }

    public double computeNetPay(){
        return computeGrossPay() * 0.8;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Salary : " + Salary);
    }

}
