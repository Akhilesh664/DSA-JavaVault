package JavaExtras;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return id + ":" + name;
    }


    // Overriding compareTo() used in Comparable interface
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    // Used for Comparator
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static Comparator<Employee> IdComparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getId(), e2.getId());
        }
    };

}
