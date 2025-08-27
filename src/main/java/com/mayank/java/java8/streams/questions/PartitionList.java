package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        List<Integer> list = GetData.getIntegerList();

        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(partition);
    }
}
