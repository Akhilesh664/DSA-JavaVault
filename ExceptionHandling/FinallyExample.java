package ExceptionHandling;

public class FinallyExample {

    public static void main(String[] args) {

        try {
            int num = 5 / 0;
        }catch (ArithmeticException e){
            System.out.println("Exception caught: "+e.getMessage());
        }finally {
            System.out.println("Finally blocked executed.");
        }
    }
}
