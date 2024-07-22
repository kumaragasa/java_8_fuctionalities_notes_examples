package com.java8.javafunctional.chapter5_predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // BiPredicate to check if the sum of two integers is greater than 10
        BiPredicate<Integer, Integer> sumGreaterThanTen = (x, y) -> (x + y) > 10;

        // Test the BiPredicate
        System.out.println(sumGreaterThanTen.test(5, 4));  // Output: false
        System.out.println(sumGreaterThanTen.test(5, 6));  // Output: true

        // BiPredicate to check if two strings are equal ignoring case
        BiPredicate<String, String> isEqualIgnoreCase = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(isEqualIgnoreCase.test("hello", "HELLO"));  // Output: true
        System.out.println(isEqualIgnoreCase.test("hello", "world"));  // Output: false
    }
}
