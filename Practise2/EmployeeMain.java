// 2st cdac java assignment 2

package Practise2;

public class EmployeeMain {

    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee(123456789, "John", "Doe", 20.5);
        SalariedEmployee salariedEmployee = new SalariedEmployee(987654321, "Jane", "Smith", 5000);


        System.out.println("Hourly Employee:");
        hourlyEmployee.print();
        System.out.println("Gross Pay: " + hourlyEmployee.computeGrossPay());
        System.out.println("Net Pay: " + hourlyEmployee.computeNetPay());

        System.out.println("\nSalaried Employee:");
        salariedEmployee.print();
        System.out.println("Gross Pay: " + salariedEmployee.computeGrossPay());
        System.out.println("Net Pay: " + salariedEmployee.computeNetPay());

//        var se = new SalariedEmployee(1223343643, "anil", "sharma", 30000);
//        se.print();
//        se.setFirstName("Arpit");
//        se.print();
    }

}
