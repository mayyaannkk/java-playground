package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        List<Integer> list = GetData.getIntegerList();

        long count = list.stream()
                .distinct()
                .count();
        System.out.println("Contains duplicate? " + (count != list.size()));
    }
}
