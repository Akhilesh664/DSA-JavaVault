package ExceptionHandling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(12);
        } catch (CustomException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }

    static void checkAge(int age) throws CustomException{
        if(age < 18){
            throw new CustomException("Age must be 18 or above.");
        }
    }
}
