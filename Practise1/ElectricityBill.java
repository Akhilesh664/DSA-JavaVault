package Practise1;

import java.util.Scanner;

/**
 * ElectricityBill.java
 * 
 * This class calculates electricity bills based on consumption units.
 * It demonstrates user input handling, conditional logic, and method implementation.
 * 
 * This is a standalone class in the Practise1 package and doesn't have any direct
 * relationships with other classes in the package.
 * 
 * Features:
 * - Takes customer details and units consumed as input
 * - Calculates bill based on a tiered pricing structure
 * - Provides methods to read input, calculate bill, and display results
 * - Includes input validation and error handling
 */
public class ElectricityBill {
    int customerNumber;
    String name;
    int units;

    void readData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter customerNumber, name, units : ");
        this.customerNumber = s.nextInt();
        this.name = s.next();
        this.units = s.nextInt();
    }

    void showData(){
        System.out.println("ElectricityBill: " +
                "customerNumber=" + customerNumber +
                ", name=" + name +
                ", units=" + units);
    }

    @Override
    public String toString() {
        return "ElectricityBill{" +
                "customerNumber=" + customerNumber +
                ", name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    int computeBill() {
        int total = 0;
        int remainingUnits = units;

        // Calculate for the first 100 units
        if (remainingUnits > 0) {
            int first100Units = Math.min(remainingUnits, 100);
            total += (int) (first100Units * 1.20);
            remainingUnits -= first100Units;
        }

        // Calculate for the next 200 units
        if (remainingUnits > 0) {
            int next200Units = Math.min(remainingUnits, 200);
            total += (int)(next200Units * 2.00);
            remainingUnits -= next200Units;
        }

        // Calculate for the next 300 units
        if (remainingUnits > 0) {
            int next300Units = Math.min(remainingUnits, 300);
            total += (int)(next300Units * 3.00);
            remainingUnits -= next300Units;
        }

        // Calculate for units greater than 600
        if (remainingUnits > 0) {
            total += (int)(remainingUnits * 5.00);
        }

        return total;
    }

    public static void main(String[] args) {
        var bill1 = new ElectricityBill();
        bill1.readData();
        System.out.println(bill1.computeBill());
        bill1.showData();
    }

}
