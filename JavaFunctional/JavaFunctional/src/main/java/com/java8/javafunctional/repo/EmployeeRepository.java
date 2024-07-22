package com.java8.javafunctional.repo;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public static List<Employee> getAllEmployees() {
        Employee e1 = new Employee("Kumar", 120, 2000, "Male", 3, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Employee e2 = new Employee("amar", 135, 5000, "Female", 5, Arrays.asList("Driving", "Music", "Football"));
        Employee e3 = new Employee("Ajay12", 140, 5700, "Male", 3, Arrays.asList("Cricket", "Driving", "Tennis"));
        Employee e4 = new Employee("Vijay", 150, 2000, "Female", 7, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Employee e5 = new Employee("Jagdish", 125, 9000, "Female", 8, Arrays.asList("Football", "Swimming", "Tennis"));
        Employee e6 = new Employee("Akbar12", 110, 9501, "Male", 5, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Employee e7 = new Employee("Rahul", 165, 1548, "Male", 9, Arrays.asList("Swimming", "Tennis"));

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
    }

    public static Employee getEmployee() {
        return new Employee("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
    }


}
