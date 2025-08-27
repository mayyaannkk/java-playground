package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.entities.Student;
import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        List<Student> students = GetData.getStudents();

        double average = students.stream()
                .mapToInt(student -> student.getAge())
                .average().orElse(0.0);

        System.out.println(average);

        double collect = students.stream()
                .collect(Collectors.averagingInt(Student::getAge));
        System.out.println(collect);
    }
}
