// 6th cdac java assignment 3

package Practise3;

public class CommissionEmployee extends Employee{

    private double sales;
    private double commission;

    public CommissionEmployee(String name, String ssn, double sales, double commission) {
        super(name, ssn);
        this.sales = sales;
        this.commission = commission;
    }

    @Override
    public double salary(){
        return sales * commission;
    }

    @Override
    public String toString() {
        return "CommissionEmployee: " + name + " (SSN: " + ssn + "), Salary: " + salary();
    }
}
