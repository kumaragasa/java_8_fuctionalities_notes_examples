package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.Duration;
import java.time.LocalTime;

public class _6DurationExample {
    public static void main(String[] args) {
        // Duration of 2 hours
        Duration duration = Duration.ofHours(2);
        System.out.println("Duration: " + duration);

        // Creating a duration from a time
        LocalTime start = LocalTime.of(10, 30);
        LocalTime end = LocalTime.of(13, 00);
        Duration timeBetween = Duration.between(start, end);
        System.out.println("Time Between: " + timeBetween);

        // Adding duration to time
        LocalTime newTime = start.plus(timeBetween);
        System.out.println("New Time: " + newTime);
    }
}
