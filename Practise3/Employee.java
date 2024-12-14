// 6th cdac java assignment 3

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
