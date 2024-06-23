package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionEx {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);;
        //Function<Integer, Integer> doubleIt = number -> number * 2;
        List<Integer> doubleNumbers = numbers.stream()
                //.map(doubleIt)
                .map(number -> number * 2)
                .toList();


        doubleNumbers.forEach(System.out::println);
    }


}
