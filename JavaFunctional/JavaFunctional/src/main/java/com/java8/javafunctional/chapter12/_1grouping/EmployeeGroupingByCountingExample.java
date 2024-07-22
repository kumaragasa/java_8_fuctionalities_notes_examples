package com.java8.javafunctional.chapter12._1grouping;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupingByCountingExample {
    public static void main(String[] args) {

        List<Employee> empList = EmployeeRepository.getAllEmployees();

        // Group employees by age and count them
        Map<Integer, Long> employeeCountByKids = empList.stream()
                .collect(Collectors.groupingBy(Employee::getKids, Collectors.counting()));

        // Print the count of employees by Kids
        employeeCountByKids.forEach((kids, count) -> {
            System.out.println("Kids " + kids + ": " + count + " employees");
        });
    }
}
