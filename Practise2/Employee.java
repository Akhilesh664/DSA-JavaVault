// 2st cdac java assignment 2

package Practise2;

public class Employee {
    private Long SSN;
    private String FirstName;
    private String LastName;


    // default constructor
//    public Employee() {
//    }

    public Employee(Long SSN, String firstName, String lastName) {
        this.SSN = SSN;
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public Long getSSN() {
        return SSN;
    }

    public void setSSN(Long SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }



    public void print(){
        System.out.println("SSN : "+SSN);
        System.out.println("FirstName : "+FirstName);
        System.out.println("LastName : "+LastName);
    }


}
