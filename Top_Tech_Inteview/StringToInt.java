package Top_Tech_Inteview;

public class StringToInt {
    public static void main(String[] args) {

        // String to Integer
        String numStr = "12345";
        int num = Integer.parseInt(numStr);
        System.out.println("String converted to Integer: "+ num);

        // Integer -> String
        int number = 54321;
        String numberStr = Integer.toString(number);
        System.out.println("Integer converted to String: " + numberStr);
    }
}