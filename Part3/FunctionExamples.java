package Part3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExamples {

    // 1. Basic Function
    public void greet1(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 2. Function with Return Type
    public int add(int a, int b) {
        return a + b;
    }

    // 3. Function Overloading
    public void print(String value) {
        System.out.println(value);
    }

    public void print(int value) {
        System.out.println(value);
    }

    // 4. Function with Multiple Parameters
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // 5. Function with Default Parameters (Using Overloading)
    public void greet() {
        System.out.println("Hello, Guest!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String name, String message) {
        System.out.println(message + ", " + name + "!");
    }

    // 6. Function with Variable Arguments (Varargs)
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 7. Recursive Function
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 8. Function Returning an Array
    public int[] generateFibonacci(int n) {
        int[] fibonacciSeries = new int[n];
        if (n > 0) fibonacciSeries[0] = 0;
        if (n > 1) fibonacciSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        return fibonacciSeries;
    }

    // 9. Function as a Parameter
    public void applyFunction(int[] array, Operation operation) {
        for (int i = 0; i < array.length; i++) {
            array[i] = operation.execute(array[i]);
        }
    }

    @FunctionalInterface
    interface Operation {
        int execute(int x);
    }

    // 10. Static Function
    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    // 11. Function with Exception Handling
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    // 12. Anonymous Function (Lambda)
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public void demonstrateLambda() {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.calculate(10, 5));
    }

    // 13. Function Using Streams
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .collect(Collectors.toList());
    }

    // 14. Function Returning Another Function
    public Function<Integer, Integer> createMultiplier(int factor) {
        return x -> x * factor;
    }

    // 15. Recursive Function for String Reversal
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        FunctionExamples examples = new FunctionExamples();

        // Example calls for each method
        examples.greet1("Akhilesh");
        System.out.println("Sum: " + examples.add(5, 10));
        examples.print("Hello World");
        examples.print(123);
        System.out.println("Area: " + examples.calculateArea(5, 10));
        examples.greet("Akhilesh", "Good Morning");
        System.out.println("Sum of varargs: " + examples.sum(1, 2, 3, 4, 5));
        System.out.println("Factorial of 5: " + examples.factorial(5));
        System.out.println("Fibonacci Series: " + Arrays.toString(examples.generateFibonacci(10)));

        int[] numbers = {1, 2, 3, 4, 5};
        examples.applyFunction(numbers, x -> x * x);
        System.out.println("Squared numbers: " + Arrays.toString(numbers));

        System.out.println("Uppercase: " + FunctionExamples.convertToUpperCase("hello"));

        System.out.println("Division Result: " + examples.divide(10, 2));
        System.out.println("Division by Zero: " + examples.divide(10, 0));

        examples.demonstrateLambda();

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers: " + examples.filterEvenNumbers(nums));

        Function<Integer, Integer> multiplier = examples.createMultiplier(3);
        System.out.println("Multiplier of 3: " + multiplier.apply(10));

        System.out.println("Reversed String: " + examples.reverseString("Java"));
    }
}

