package Challenges;

import java.util.Arrays;
import java.util.List;

public class DistinctVerify {

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        distinctVerify();
    }

    public static void distinctVerify() {
        List<Integer> distinctNum = numbers.stream()
                .distinct()
                .toList();

        if (!distinctNum.isEmpty()) {
            System.out.println("Unique numbers list: "+ distinctNum);
        }
    }

}
