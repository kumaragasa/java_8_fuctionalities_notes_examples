package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _3LocalDateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // Creating a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 19, 15, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Parsing date and time from a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-07-19T15:30:00", formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Date and time operations
        LocalDateTime futureDateTime = now.plusDays(1).plusHours(2);
        System.out.println("Future Date and Time: " + futureDateTime);
    }
}
