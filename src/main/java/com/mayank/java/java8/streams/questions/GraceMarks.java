package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class GraceMarks {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();

        List<Integer> graceMarks = list.stream()
                .filter(marks -> marks < 5)
                .map(marks -> marks + 5)
                .toList();

        System.out.println("Marks: " + list);
        System.out.println("Grace marks to failed students: " + graceMarks);
    }
}
