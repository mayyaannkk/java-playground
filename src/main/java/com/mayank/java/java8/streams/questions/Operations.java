package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.utilities.GetData;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Operations {
    public static void main(String[] args) {
        List<Integer> list = GetData.getList();

        IntSummaryStatistics intSummaryStatistics = list.stream()
                .mapToInt(n -> n)
                .summaryStatistics();
        System.out.println("max: " + intSummaryStatistics.getMax());
        System.out.println("min: " + intSummaryStatistics.getMin());
        System.out.println("avg: " + intSummaryStatistics.getAverage());
        System.out.println("count: " + intSummaryStatistics.getCount());
    }
}
