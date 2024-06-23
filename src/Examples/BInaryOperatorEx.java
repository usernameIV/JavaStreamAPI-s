package Examples;

import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;


public class BInaryOperatorEx {

    public static void main(String[] args) {

    resultOfArrayOperation();

    }

    static void resultOfArrayOperation() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> sum = Integer::sum;

        int result = numbers
                .stream().
                reduce(0, sum);

        System.out.println("The sum result is " + result);
    }
}
