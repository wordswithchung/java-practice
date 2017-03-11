package com.company;

import java.util.List;

/**
 * Created by chungnguyen on 3/10/17.
 */
public class RecursiveSum {

    public static Integer recursiveSum(List<Integer> numbers) {

        if (numbers.size() < 2) {
            return numbers.get(0);
        }

        return numbers.get(0) + recursiveSum(numbers.subList(1, numbers.size()));
    }
}
