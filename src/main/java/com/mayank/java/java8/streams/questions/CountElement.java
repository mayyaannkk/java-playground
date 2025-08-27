package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElement {
    public static void main(String[] args) {
        List<String> stringList = GetData.getStringList();
        System.out.println(stringList);

        Map<String, Long> collect = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
