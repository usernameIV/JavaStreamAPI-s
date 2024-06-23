package Challenges;


//  With the help of Stream API,
//  filter the prime numbers from the list
//  and display the result in the console.

import java.util.Arrays;
import java.util.List;

public class PrimeFilter {

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        findPrimeNumbers();
    }
    public static void findPrimeNumbers() {
        List<Integer> primeNumbs = numbers.stream()
                .filter(n -> n > 1)  // 1 is not a prime number
                .filter(SieveOfEratosthenes::isPrime)
                .toList();

        System.out.println("Prime numbers: "+ primeNumbs);
    }

}
