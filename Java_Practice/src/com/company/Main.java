package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);

        System.out.println(RecursiveSum.recursiveSum(numbers1));

    }
}
