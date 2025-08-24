package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenderCount {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        Map<String, Long> gender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(gender);
    }
}
