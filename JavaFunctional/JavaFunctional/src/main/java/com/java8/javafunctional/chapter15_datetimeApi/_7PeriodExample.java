package com.java8.javafunctional.chapter15_datetimeApi;

import java.time.LocalDate;
import java.time.Period;

public class _7PeriodExample {
    public static void main(String[] args) {
        // Period of 1 year and 2 months
        Period period = Period.of(1, 2, 0);
        System.out.println("Period: " + period); // Output: Period: P1Y2M

        // Creating a period from dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 3, 1);
        Period periodBetween = Period.between(startDate, endDate);
        System.out.println("Period Between: " + periodBetween); // Output: Period Between: P1Y2M1D

        // Adding period to a date
        LocalDate newDate = startDate.plus(period);
        System.out.println("New Date: " + newDate); // Output: New Date: 2024-03-01
    }
}
