package com.java8.javafunctional.chapter8_methodreference;

import java.util.function.Function;

/*
Reference to a Static Method
 */
public class MethodReferenceExample1 {
    public static void main(String[] args) {
        // Lambda expression
        Function<String, Integer> stringLengthLambda = s -> StringUtils.stringLength(s);

        // Method reference
        Function<String, Integer> stringLengthMethodRef = StringUtils::stringLength;

        System.out.println(stringLengthMethodRef.apply("Hello"));  // Output: 5
    }
}

class StringUtils {
    public static int stringLength(String s) {
        return s.length();
    }
}

