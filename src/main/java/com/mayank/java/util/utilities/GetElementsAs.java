package com.mayank.java.util.utilities;

import java.util.Arrays;
import java.util.List;

public interface GetElementsAs {
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
}
