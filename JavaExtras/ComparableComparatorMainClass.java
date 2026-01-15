package JavaExtras;

import java.util.Arrays;

public class ComparableComparatorMainClass {

    public static void main(String[] args) {

        int[] arr = {5,9,8,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Employee[] emp = new Employee[3];
        emp[0] = new Employee(101, "John");
        emp[1] = new Employee(103, "Akhil");
        emp[2] = new Employee(102, "keven");

        Arrays.sort(emp); // calls comparable interface
        System.out.println(Arrays.toString(emp));

        Arrays.sort(emp, Employee.NameComparator); // calls comparator interface
        System.out.println(Arrays.toString(emp));

        Arrays.sort(emp, Employee.IdComparator); // calls comparator interface
        System.out.println(Arrays.toString(emp));

    }
}