package com.java8.javafunctional.chapter5_predicate;

import java.util.function.Predicate;

public class CombinedPredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanTen = x -> x > 10;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<Integer> isGreaterThanTenAndEven = isGreaterThanTen.and(isEven);

        System.out.println(isGreaterThanTenAndEven.test(8));  // Output: false
        System.out.println(isGreaterThanTenAndEven.test(12)); // Output: true
    }
}
