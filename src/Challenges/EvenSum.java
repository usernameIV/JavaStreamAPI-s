package Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class EvenSum {

//    Using the Stream API,
//    sum the even numbers in the list and
//    display the result in the console.


    public static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        sumEvenNum();
    }

    static void sumEvenNum() {
        BinaryOperator<Integer> sum = Integer::sum;

        int rest = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, sum);


        System.out.println("The sum result is "+ rest);
    }
}
