package com.java8.javafunctional.chapter12._1grouping;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupExample {
    public static void main(String[] args) {

        List<Employee> empList = EmployeeRepository.getAllEmployees();

        System.out.println("Without using java functions programming");
        Map<Integer, List<Employee>> employeesByKids = new HashMap<>();
        // Using for loop to populate the map
        for (Employee employee : empList) {
            int kids = employee.getKids();
            if (!employeesByKids.containsKey(kids)) {
                employeesByKids.put(kids, new ArrayList<>());
            }
            employeesByKids.get(kids).add(employee);
        }

        // Print grouped employees
        employeesByKids.forEach((kids, emp) -> {
            System.out.println("Kids " + kids + ": " + emp);
        });

        System.out.println("With JAVA functions programming");
        Map<Integer, List<Employee>> empMap = empList.stream()
                .collect(Collectors.groupingBy(Employee::getKids));
        empMap.forEach((kids, emp) -> {
            System.out.println("Kids " + kids + ": " + emp);
        });
    }
}
