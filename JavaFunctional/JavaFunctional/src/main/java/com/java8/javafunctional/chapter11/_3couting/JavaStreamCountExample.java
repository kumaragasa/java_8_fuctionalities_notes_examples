package com.java8.javafunctional.chapter11._3couting;

import com.java8.javafunctional.repo.Employee;
import com.java8.javafunctional.repo.EmployeeRepository;

import java.util.List;

public class JavaStreamCountExample {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeRepository.getAllEmployees();
        long count = empList.stream()
                .filter(emp -> emp.getSalary() > 5000.0)
                .count();
        System.out.println("Employee salary greater than 5000 -> " + count);


        long count1 = empList.stream()
                .filter(emp -> emp.getSalary()>6000 && emp.getGender().equals("Male"))
                .count();

        System.out.println("Employee salary greater than 6000 and Gender Male -> " + count1);
    }
}
