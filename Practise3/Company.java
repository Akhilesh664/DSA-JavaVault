// 6th cdac java assignment 3

package Practise3;

public class Company {

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new CommissionEmployee("alice","1234567798",5000,0.1);
        emp[1] = new HourlyEmployee("bob","8765432156",15.6,50);
        emp[2] = new SalariedEmployee("charlie","347485394882",300000);

        Payroll payroll = new Payroll(emp);
        payroll.paySalary();
    }
}
