package com.company;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/6/17.
 */
public class AddToZeroTest {

    @Test
    public void testIsSumZero() throws Exception {
        AddToZero zeroSum = new AddToZero();

        ArrayList<Integer> numbersFalse = new ArrayList<Integer>();
        numbersFalse.add(8);
        numbersFalse.add(9);
        numbersFalse.add(138);

        ArrayList<Integer> numbersTrue0 = new ArrayList<Integer>();
        numbersTrue0.add(5);
        numbersTrue0.add(48);
        numbersTrue0.add(392);
        numbersTrue0.add(0);

        ArrayList<Integer> numbersTrueSum = new ArrayList<Integer>();
        numbersTrueSum.add(5);
        numbersTrueSum.add(-23);
        numbersTrueSum.add(11);
        numbersTrueSum.add(-5);

        Assert.assertFalse(zeroSum.isSumZero(numbersFalse));
        Assert.assertTrue(zeroSum.isSumZero(numbersTrue0));
        Assert.assertTrue(zeroSum.isSumZero(numbersTrueSum));
    }

}