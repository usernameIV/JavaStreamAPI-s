package Challenges;

import java.util.Arrays;
import java.util.List;

//  ~Use the Stream API to group numbers into two separate lists,
//  one containing the even numbers and
//  one containing the odd numbers from the original list,
//  and display the results in the console.~

public class DistinctLists {

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        bothLists();
    }

    public static void bothLists() {
        List<Integer> even = numbers.stream()
                .sorted()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("List of even numbers: "+ even);
        System.out.println();
        List<Integer> odd = numbers.stream()
                .sorted()
                .distinct()
                .filter(n -> !(n % 2 == 0))
                .toList();

        System.out.println("List of odd numbers: "+ odd);
    }
}
