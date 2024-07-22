package com.java8.javafunctional.chapter11._5finding;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class JavaStreamFindingExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();

        //find first
        Optional<Employee> empOpt = empList.stream()
                .peek(System.out::println)
                .filter(emp -> emp.getName().length() > 5)
                .findFirst();
        System.out.println(empOpt.get());
        System.out.println("************");
        //find any
        Optional<Employee> findAnyEmp = empList.stream()
                .filter(emp -> emp.getHeight()>140)
                .findAny();
        System.out.println(findAnyEmp.get());


    }
}
