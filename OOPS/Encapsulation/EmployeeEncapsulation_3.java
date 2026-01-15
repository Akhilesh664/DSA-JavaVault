package OOPS.Encapsulation;

// [NOTE]: final + no setter = strong encapsulation
// Used for IDs, Aadhar, PAN, SSN

class Employee {
    private final int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        // Not allowed
//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }

}

public class EmployeeEncapsulation_3 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Akhil");
        System.out.println(e1.getEmpId());
        System.out.println(e1.getName());
//        e1.setEmpId(2);// [NOTE] Not allowed as it is final
        e1.setName("Anil");
        System.out.println(e1.getEmpId()+", "+e1.getName());

    }
}
