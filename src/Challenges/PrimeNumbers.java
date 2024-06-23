package Challenges;

import java.util.*;

// With the Stream API, find the
// largest prime number in the list and
// display the result in the console.

public class PrimeNumbers {

    public static List<Integer> numbers =
            Arrays.asList(1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public static void main(String[] args) {
        findGreaterPrimeNumber();
    }

    public static void findGreaterPrimeNumber() {
        Optional<Integer> largestPrime = numbers.stream()
                .filter(n -> n > 1)  // 1 is not a prime number
                .filter(SieveOfEratosthenes::isPrime)
                .max(Integer::compareTo);

        if (largestPrime.isPresent()) {
            System.out.println("The largest prime number in the list is: " + largestPrime.get());
        } else {
            System.out.println("No prime numbers found in the list.");
        }
    }
}

class SieveOfEratosthenes {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
