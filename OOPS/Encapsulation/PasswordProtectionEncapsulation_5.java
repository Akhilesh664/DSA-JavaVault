package OOPS.Encapsulation;

// [NOTE]: Password is never exposed
// Real-world encapsulation example
class User {
    private String Username;
    private String Password;

    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public boolean login(String enteredPassword){
        return Password.equals(enteredPassword);
    }

}

public class PasswordProtectionEncapsulation_5 {
    public static void main(String[] args) {
        User user = new User("Akhil", "1234");

        if(user.login("1234")){
            System.out.println("Login successful!");
        }else{
            System.out.println("Invalid password!");
        }

    }
}
