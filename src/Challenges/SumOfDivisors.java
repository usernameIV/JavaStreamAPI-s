package Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SumOfDivisors {

//    With the Stream API, find
//    the sum of numbers in the list that are divisible by both 3 and 5 and
//    display the result in the console.

    static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);
    public static void main(String[] args) {
        sumDivisors();
    }

    public static void sumDivisors() {
        BinaryOperator<Integer> sum = Integer::sum;

        int eggs = numbers.stream()
                .distinct()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce(0, sum);

        System.out.println("The sum of numbers in the list that are divisible by both 3 and 5 is: " +eggs);
    }
}
