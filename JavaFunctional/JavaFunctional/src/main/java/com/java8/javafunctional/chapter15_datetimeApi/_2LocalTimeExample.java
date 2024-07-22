package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _2LocalTimeExample {
    public static void main(String[] args) {
        // Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // Creating a specific time
        LocalTime specificTime = LocalTime.of(15, 30);
        System.out.println("Specific Time: " + specificTime);

        // Parsing time from a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parsedTime = LocalTime.parse("15:30:00", formatter);
        System.out.println("Parsed Time: " + parsedTime);

        // Time operations
        LocalTime later = now.plusHours(1);
        System.out.println("One Hour Later: " + later);
        System.out.println(now.plusMinutes(20));
    }
}

