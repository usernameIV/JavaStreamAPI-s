package Challenges;

import java.util.Arrays;
import java.util.List;

public class NumberOrder {

//    Create a program that uses the
//    Stream API to sort the list of numbers
//    in ascending order and display it in the console.


    public static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public static void main(String[] args) {
        orderArray();
    }

    static void orderArray() {
        List<Integer> orderedNumbers = numbers.stream().
                sorted().
                toList();

        System.out.println("Numbers in order: "+ orderedNumbers);
    }

}


