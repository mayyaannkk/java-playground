package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetElementsAs;

import java.util.List;

public class PeekDubug {
    public static void main(String[] args) {
        List<Integer> list = GetElementsAs.getList();
        System.out.println("List: " + list);

        List<Integer> graceMarks = list.stream()
                .peek(num -> System.out.println("Before filter: " + num))
                .filter(marks -> marks < 5)
                .peek(num -> System.out.println("Before map: " + num))
                .map(marks -> marks + 5)
                .peek(num -> System.out.println("After map: " + num))
                .toList();

        System.out.println(graceMarks);
    }
}
