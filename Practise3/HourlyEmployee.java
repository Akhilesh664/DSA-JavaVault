// 6th cdac java assignment 3
// Extends Employee. Represents an employee paid by the hour. Used by Company and Payroll

package Practise3;

public class HourlyEmployee extends Employee {

    protected double wage;
    protected double hours;

    public HourlyEmployee(String name, String ssn, double wage, double hours) {
        super(name, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double salary(){
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee: " + name + " (SSN: " + ssn + "), Salary: " + salary();
    }
}
