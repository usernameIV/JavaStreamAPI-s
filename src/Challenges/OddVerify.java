package Challenges;

import java.util.Arrays;
import java.util.List;

//  Use the Stream API to remove odd values
//  from the list and
//  print the resulting list to the console.


public class OddVerify {

    public static List<Integer> numbers
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        verifyOddNumber();
    }

    static void verifyOddNumber() {
        numbers.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}

