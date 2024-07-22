package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _5InstantExample {
    public static void main(String[] args) {
        // Current instant
        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);

        // Creating a specific instant
        Instant specificInstant = Instant.parse("2024-07-21T05:25:37.00Z");
        System.out.println("Specific Instant: " + specificInstant);

        // Converting Instant to ZonedDateTime
        ZonedDateTime zonedDateTime = specificInstant.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("ZonedDateTime from Instant: " + zonedDateTime);
    }
}
