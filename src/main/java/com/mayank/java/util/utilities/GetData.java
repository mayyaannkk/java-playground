package com.mayank.java.util.utilities;

import com.mayank.java.util.entities.Transaction;

import java.util.Arrays;
import java.util.List;

public interface GetData {
    static List<Integer> getList() {
        return Arrays.asList(5,                                // Single element scenario
                3, 3, 3,                           // Duplicates
                -5, -1, -10,                       // Negative numbers
                0, 0, 1, 2,                        // Zeros and positives
                Integer.MAX_VALUE, Integer.MIN_VALUE, // Extreme values
                -2, 0, 5, -10, 8,                  // Mixed positives/negatives
                1, 2, 3, 4, 5,                     // Ascending order
                5, 4, 3, 2, 1,                     // Descending order
                2, 3, 5, 7, 11,                    // Primes
                2, 4, 6, 8, 10,                    // Even numbers
                1, 3, 5, 7, 9,                     // Odd numbers
                8, 1, 10, -3, 4);
    }
    static List<Transaction> getTransactions() {
        return Arrays.asList(
                new Transaction("2025-04-20", 100.50),
                new Transaction("2025-04-20", 200.75),
                new Transaction("2025-04-21", 150.00),
                new Transaction("2025-04-21", 50.25),
                new Transaction("2025-04-22", 300.00)
        );
    }
}
