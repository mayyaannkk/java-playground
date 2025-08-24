package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class FailedCount {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();

        long failedCount = list.stream()
                .filter(marks -> marks < 4)
                .count();

        System.out.println("Marks: " + list);
        System.out.println("Failed count: " + failedCount);
    }
}
