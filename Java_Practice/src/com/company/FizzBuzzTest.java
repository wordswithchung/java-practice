package com.company;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by chungnguyen on 3/7/17.

public class FizzBuzzTest {
    @Test
    public Boolean testFizzBuzz() throws Exception {
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(1);
        testNumbers.add(3);
        testNumbers.add(5);
        testNumbers.add(-1);
        testNumbers.add(0);
        testNumbers.add(30);

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(1);

        assertEquals(FizzBuzz.fizzBuzz(test1), "1");
    }

}*/