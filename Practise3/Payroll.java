// 6th cdac java assignment 3
// Processes salary payments for an array of Employee objects. Used by Company
package Practise3;

public class Payroll {

    Employee[] employee;

    public Payroll(Employee[] employee) {
        this.employee = employee;
    }

    public void paySalary(){
        for (Employee value : employee) {
//            System.out.println(value);
//            System.out.println("Salary: " + value.salary());
            System.out.println(value.toString());
        }
    }
}
