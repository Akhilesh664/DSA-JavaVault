// 6th cdac java assignment 3
// Extends Employee. Represents an employee with a fixed salary. Used by Company and Payroll
package Practise3;

public class SalariedEmployee extends Employee{

    protected double basicSalary;

    public SalariedEmployee(String name, String ssn, double basicSalary) {
        super(name, ssn);
        this.basicSalary = basicSalary;
    }

    @Override
    public double salary(){
        return basicSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " + name + " (SSN: " + ssn + "), Salary: " + salary();
    }
}
