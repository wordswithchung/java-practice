package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/5/17.
 */
public class AddToZero {
    // Given list of ints, return True if any two nums in list sum to 0.

    public AddToZero() {
        // constructor
    }

    public static boolean isSumZero(ArrayList<Integer> numbers) {

        if (numbers.contains(0)) {
            return true;
        }

        for (Integer number : numbers) {
            if (numbers.contains(number * -1)) {
                return true;
            }
        }

        return false;
    }
}
