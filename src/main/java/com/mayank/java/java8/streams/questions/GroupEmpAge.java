package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.database.EmployeeDatabase;
import com.mayank.java.util.entities.Employee;
import com.mayank.java.util.utilities.GetData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpAge {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        Map<String, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(collect);
    }
}
