package com.java8.javafunctional.repo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int height;
    private double salary;
    private String gender;
    private int kids;
    List<String> hobbies = new ArrayList<>();

}
