package com.java8.javafunctional.chapter5_predicate;

import java.util.function.BiPredicate;

public class CombinedBiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> sumGreaterThanTen = (x, y) -> (x + y) > 10;
        BiPredicate<Integer, Integer> sumEven = (x, y) -> (x + y) % 2 == 0;

        BiPredicate<Integer, Integer> sumGreaterThanTenAndEven = sumGreaterThanTen.and(sumEven);

        System.out.println(sumGreaterThanTenAndEven.test(5, 4));  // Output: false
        System.out.println(sumGreaterThanTenAndEven.test(5, 6));  // Output: false
        System.out.println(sumGreaterThanTenAndEven.test(6, 6));  // Output: true
    }
}

