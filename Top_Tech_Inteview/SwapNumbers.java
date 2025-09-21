package Top_Tech_Inteview;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before: a=" + a + ", b=" + b);

        // 1 Way: Using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;

        // 2 Way: Using XOR (alternative)
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        System.out.println("After: a=" + a + ", b=" + b);
    }
}
