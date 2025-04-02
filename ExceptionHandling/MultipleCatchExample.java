package ExceptionHandling;

public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception.");
        } catch (Exception e) {
            System.out.println("General Exception Caught."+e);
        }
    }
}
