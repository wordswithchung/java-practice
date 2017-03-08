package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/6/17.
 */
public class FizzBuzz {

    public static void fizzBuzz(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
            } else if (number % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }

    }
}
