package Java_8.CodingQuestionsBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class LambdaExp_1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 34, 7, 33, 5, 2);

        // Runnable Lambda
        Runnable r = () -> System.out.println("Runnable Lambda Executed");
        r.run();


//        // Comparator
//        numbers.sort((n1, n2)-> n1.compareTo(n2));
//        System.out.println(numbers);


//        // forEach
//        numbers.forEach((n)-> System.out.println(n));


//        // Predicate
//        Predicate<Integer> isEven = n -> n%2 == 0;
//        Predicate<Integer> isOdd = n -> n%2 != 0;
//        System.out.println("Is 10 is Even :" + isEven.test(10));
//        System.out.println("Is 9 is Odd :" + isOdd.test(9));


//        // Function
//        Function<Integer, Integer> square = x -> x * x;
//        System.out.println("Square of 10 is :" + square.apply(10));


//        // Consumer
//        Consumer<String> printer = s -> System.out.println("Hello "+s);
//        printer.accept("Akhilesh");


//        // Supplier
//        Supplier<Double> randomValue = () -> Math.random();
//        System.out.println("Random Value : "+randomValue.get());


//        // Stream filter + Lambda
//        List<Integer> evenNumbers = numbers
//                .stream()
//                .filter(n -> n % 2 == 0)
//                .toList();
//        System.out.println("Even Numbers: "+evenNumbers);
//        evenNumbers.forEach(System.out::println);


//        // Stream map + Lambda
//        List<Integer> squares = numbers
//                .stream()
//                .map(n -> n * n)
//                .toList();
//        System.out.println("Squares: "+squares);
//        squares.forEach(System.out::println);


//        // Stream reduce + Lambda
//        int sum = numbers
//                .stream()
//                .reduce(0, (a, b) -> a + b);
//        System.out.println("Sum: "+sum);


//        // Method Reference (Lambda Shortcut)
//        numbers.forEach(System.out::println);


//        // Custom Functional Interface with Lambda
//        Calculator add = (a, b) -> a+b;
//        Calculator mul = (a, b) -> a*b;
//        System.out.println("Sum: "+add.calculate(10, 5));
//        System.out.println("Sum: "+add.calculate(10, 5));

    }
}
