package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _1LocalDateExample {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today); 

        // Creating a specific date
        LocalDate specificDate = LocalDate.of(2024, 7, 19);
        System.out.println("Specific Date: " + specificDate); 

        // Parsing a date from a string
        System.out.println(LocalDate.parse("2024/07/19"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parsedDate = LocalDate.parse("2024/07/19", formatter);
        System.out.println("Parsed Date: " + parsedDate); 

        // Date operations
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow); 
    }
}
