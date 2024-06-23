package Challenges;

import java.util.Arrays;
import java.util.List;

public class MatchingNumbers {

//    Using the Stream API, check if
//    all numbers in the list are the same and
//    display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 1, 1, 1, 2, 1, 1, 1, 1);
    public static List<Integer> numbersA =
            Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1);

    public static void main(String[] args) {
        verifyMatching();
        System.out.println();
        verifyMatchingA();
    }

    public static void verifyMatching() {
        boolean hasMatching = numbers.stream()
                .allMatch(numbers.getFirst()::equals);

        if (hasMatching) {
            System.out.println("All numbers in "+ numbers + " matches");
        }
        else {
            System.out.println("Not all numbers matches in: "+ numbers);
        }
    }
    public static void verifyMatchingA() {
        boolean hasMatching = numbersA.stream()
                .allMatch(numbersA.getFirst()::equals);

        if (hasMatching) {
            System.out.println("All numbers in "+ numbersA + " matches");
        }
        else {
            System.out.println("Not all numbers matches in: "+ numbersA);
        }
    }
}
