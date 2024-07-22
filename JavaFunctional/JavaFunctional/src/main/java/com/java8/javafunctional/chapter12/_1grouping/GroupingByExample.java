package com.java8.javafunctional.chapter12._1grouping;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        // Group employees by Kids and summarize their salaries
        Map<Integer, DoubleSummaryStatistics> salarySummaryByKids = empList.stream()
                .collect(Collectors.groupingBy(Employee::getKids, Collectors.summarizingDouble(Employee::getSalary)));

        // Print salary summary by Kids
        salarySummaryByKids.forEach((kids, summary) -> {
            System.out.println("Kids " + kids + ": " + summary);
        });
    }
}
