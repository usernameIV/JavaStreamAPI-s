package Challenges;

import java.util.Arrays;
import java.util.List;

public class ProductOfAllElements {

//  With the help of Stream API,
//  find the product of all numbers in the list and
//  display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);


    public static void main(String[] args) {
        findProductOfList();
    }

    public static void findProductOfList() {
        int a = numbers.stream()
                .mapToInt(n -> n * numbers.size())
                .sum();

        System.out.println("The product of all numbers in the list is :"+ a);
    }
}
