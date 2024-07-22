package com.java8.javafunctional.chapter10._3sorting;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.Comparator;
import java.util.List;

public class SortEmployeeExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();
        System.out.println("============== Before sorting ==============");
        empList.forEach(System.out::println);

        System.out.println("============== After sorting ==============");
        empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);
    }
}
