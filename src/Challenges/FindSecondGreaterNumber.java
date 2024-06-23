package Challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondGreaterNumber {

//    With the help of Stream API,
//    find the second-largest number in the list and
//    display the result in the console.

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        findSecondGreater();
    }
    public static void findSecondGreater() {
        Optional<Integer> secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second greater value is: "+ secondLargest);
    }

}
