package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/8/17.
 */
public class FindTheRange {

    // Given a list of numbers, return the smallest and the largest number.
    public static String findRange(ArrayList<Integer> numbers) {
        Integer smallest = numbers.get(0);
        Integer largest = numbers.get(0);

        for (Integer number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        return "(" + smallest.toString() + ", " + largest.toString() + ")";
    }
}
