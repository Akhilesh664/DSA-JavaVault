package Java_8.CodingQuestionsBank;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi_2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> names = Arrays.asList("Java", "Python", "C", "Java", "Go", "Java");

        // 1. Filter even numbers
//        List<Integer> evens = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .toList();
//        System.out.println("1. Even Numbers: " + evens);


        // 2. filter even and Odd in one stream line
        Map<Boolean, List<Integer>> map = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("1. Even Numbers: " + map.get(true));
        System.out.println("2. Odd Numbers: " + map.get(false));


        // 2. Square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("2. Squares: " + squares);

        // 3. Find sum using reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("3. Sum: " + sum);

        // 4. Find max value
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("4. Max: " + max);

        // 5. Find min value
        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println("5. Min: " + min);

        // 6. Count elements
        long count = numbers.stream().count();
        System.out.println("6. Count: " + count);

        // 7. Remove duplicates
        List<String> uniqueNames = names.stream()
                .distinct()
                .toList();
        System.out.println("7. Unique Names: " + uniqueNames);

        // 8. Sort numbers
        List<Integer> sortedAsc = numbers.stream()
                .sorted()
                .toList();
        System.out.println("8. Sorted Asc: " + sortedAsc);

        // 9. Sort numbers in descending order
        List<Integer> sortedDesc = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println("9. Sorted Desc: " + sortedDesc);

        // 10. Limit elements
        List<Integer> limited = numbers.stream()
                .limit(5)
                .toList();
        System.out.println("10. Limited: " + limited);

        // 11. Skip elements
        List<Integer> skipped = numbers.stream()
                .skip(5)
                .toList();
        System.out.println("11. Skipped: " + skipped);

        // 12. Find first element
        int first = numbers.stream()
                .findFirst()
                .get();
        System.out.println("12. First: " + first);

        // 13. Check if any number is greater than 8
        boolean anyMatch = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println("13. Any > 8: " + anyMatch);

        // 14. Check if all numbers are positive
        boolean allMatch = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("14. All Positive: " + allMatch);

        // 15. Check if none are negative
        boolean noneMatch = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("15. None Negative: " + noneMatch);

        // 16. Convert stream to array
        Integer[] arr = numbers.stream()
                .toArray(Integer[]::new);
        System.out.println("16. Array: " + Arrays.toString(arr));

        // 17. Collect to Set
        Set<Integer> numberSet = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println("17. Set: " + numberSet);

        // 18. Group strings by value
        Map<String, Long> frequencyMap = names.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ));
        System.out.println("18. Frequency Map: " + frequencyMap);

        // 19. Join strings
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("19. Joined: " + joined);

        // 20. Parallel Stream
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("20. Parallel Sum: " + parallelSum);

    }
}
