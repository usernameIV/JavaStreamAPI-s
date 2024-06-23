package Challenges;

import java.util.Arrays;
import java.util.List;

public class SquareOfElements {

//    Using the Stream API, find the sum of squares of
//    all numbers in the list and
//    display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        sumOfSquares();
        //otherMethod();
    }

    public static void sumOfSquares() {
        System.out.println("Sum of squares of all numbers: ");
        int egg = numbers.stream()
                .distinct()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(egg);
    }
    public static void otherMethod() {
        numbers.stream()
                .distinct()
                .map(n -> String.join("\t",n.toString(),String.valueOf(Math.pow(n, 2))))
                .forEach(System.out::println);
    }
}
