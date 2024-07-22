package com.java8.javafunctional.chapter14_optional;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        Optional<String> nonNullOptional = Optional.of("Hello");
        Optional<String> nullableOptional = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Non-null Optional: " + nonNullOptional);
        System.out.println("Nullable Optional: " + nullableOptional.isPresent());
        System.out.println("Empty Optional: " + emptyOptional.isPresent());
    }
}

