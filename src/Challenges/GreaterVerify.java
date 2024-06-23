package Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GreaterVerify {

//    Use the Stream API to check if the list contains
//    any numbers greater than 10 and
//    display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        verifyGreaterThanTen();
    }

    public static void verifyGreaterThanTen() {
        List<Integer> a = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .toList();

        if (!a.isEmpty()) {
            System.out.println("Numbers greater than 10: " + a);
        }
        else {
            System.out.println("There is no higher value than 10...");
        }

    }
}
