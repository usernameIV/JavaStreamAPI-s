package Challenges;

import java.util.Arrays;
import java.util.List;

public class PositivityVerify {

//  With the help of Stream API, check if
//  all the numbers in the list are positive
//  and display the result in the console.

    public static List<Integer> numbers
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 4, 3);

    public static void main(String[] args) {
        positiveCheck();
    }

    public static void positiveCheck() {

        numbers.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }
}
