package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.Comparator;
import java.util.List;

public class RevSorted {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();

        List<Integer> revSorted = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Original: " + list);
        System.out.println("Rev Sorted: " + revSorted);

    }
}
