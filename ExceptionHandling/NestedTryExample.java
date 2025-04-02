package ExceptionHandling;

public class NestedTryExample {
    public static void main(String[] args) {
        try{
            try{
                int a = 5 / 0;
            } catch (ArithmeticException e){
                System.out.println("Inner catch: "+e.getMessage());
            }
            int[] arr = new int[3];
            arr[10] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: "+e.getMessage());
        }
    }
}
