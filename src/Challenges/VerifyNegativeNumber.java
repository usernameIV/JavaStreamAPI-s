package Challenges;

import java.util.Arrays;
import java.util.List;

//  Using the Stream API, check if the list contains
//  at least one negative number
//  and display the result in the console.

public class VerifyNegativeNumber {

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11, -2, -4);

    public static void main(String[] args) {
        findNegativeNumber();
    }

    public static void findNegativeNumber() {
        boolean hasNegative = numbers.stream()
                .distinct()
                .anyMatch(n -> n < 0);

        if (hasNegative) {
            System.out.println("There is a negative number");
            System.out.println(numbers);
        }
        else {
            System.out.println("There is no negative number");
            System.out.println(numbers);
        }

    }
}
