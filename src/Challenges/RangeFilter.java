package Challenges;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class RangeFilter {

//    Use the Stream API to filter numbers that
//    fall within a specific range (for example, between 5 and 10)
//    and display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        filter();
    }

    public static void filter() {
        List<Integer> inBetweenRange =numbers.stream()
                .filter(n -> n > 5 && n < 10)
                .toList();

        System.out.println("List of elements between the established range: "+ inBetweenRange);

    }
}
