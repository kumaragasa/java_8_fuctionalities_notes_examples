package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/*
* check later
* */
public class _4ZonedDateTimeExample {

    public static void main(String[] args) {
        // Current date and time with time zone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current Zoned Date and Time: " + now);

        // Creating a specific date and time with time zone
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2024, 7, 19, 15, 30, 0, 0, ZoneId.of("Asia/Kolkata"));
        System.out.println("Specific Zoned Date and Time: " + specificZonedDateTime);

        // Parsing date and time with time zone from a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX[VV]");
        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("2024-07-19T15:30:00+05:30[Asia/Kolkata]", formatter);
        System.out.println("Parsed Zoned Date and Time: " + parsedZonedDateTime);

        // Date and time with time zone operations
        ZonedDateTime futureZonedDateTime = now.plusDays(1).plusHours(2);
        System.out.println("Future Zoned Date and Time: " + futureZonedDateTime);
    }
}
