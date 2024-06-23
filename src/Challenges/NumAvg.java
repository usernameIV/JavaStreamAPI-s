package Challenges;


import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

//  With the Stream API, calculate the
//  average of numbers greater than 5 and
//  display the result in the console.

public class NumAvg {

    public static List<Integer> numbers
            = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        averageCalc();
    }

    public static void averageCalc() {
        var sus = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);

        System.out.println(sus);

    }

}
