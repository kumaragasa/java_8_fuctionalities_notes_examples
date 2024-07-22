package com.java8.javafunctional.chapter11._1collect;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToStatisticsEmployee {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();
        DoubleSummaryStatistics statistics = empList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(statistics);
    }
}
