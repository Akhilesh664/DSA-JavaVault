// 6th cdac java assignment 3
// Abstract base class for all employee types. Extended by SalariedEmployee, HourlyEmployee, and CommissionEmployee
package Practise3;

abstract class Employee{

    protected String name;
    protected String ssn;


    public Employee(String name, String ssn) {
//        super();
        this.name = name;
        this.ssn = ssn;
    }

    public abstract double salary();

    public abstract String toString();


}
