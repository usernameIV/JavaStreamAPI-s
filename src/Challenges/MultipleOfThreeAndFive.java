package Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultipleOfThreeAndFive {

//    Use the Stream API to group odd values
//    that are multiples of 3 or 5 and
//    display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        findMultiplesOf3and5();
    }

    public static void findMultiplesOf3and5() {
        List<Integer> multiples = numbers.stream()
                .sorted()
                .distinct()
                .filter(number -> number % 2 != 0)
                .filter(number -> (number % 5 == 0) || (number % 3 == 0))
                .toList();

        System.out.println("Odd values that are multiples of 3 or 5: "+ multiples);
    }

}
