package com.mayank.java.java8.streams.questions;

import com.mayank.java.util.entities.Transaction;
import com.mayank.java.util.utilities.GetData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumTransactions {
    public static void main(String[] args) {
        List<Transaction> transactions = GetData.getTransactions();
        Map<String, Double> collect = transactions.stream()
                .collect(Collectors.groupingBy(trans -> trans.getDate(), Collectors.summingDouble(Transaction::getAmount)));

        System.out.println(collect );
    }
}
