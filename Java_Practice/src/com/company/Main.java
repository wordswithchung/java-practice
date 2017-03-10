package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbersTrue = new ArrayList<Integer>();
        numbersTrue.add(0);
        numbersTrue.add(2);
        numbersTrue.add(5);

        System.out.println(AddToZero.isSumZero(numbersTrue));

        ArrayList<Integer> numbersFalse = new ArrayList<Integer>();
        numbersFalse.add(9);
        numbersFalse.add(3);

        System.out.println(AddToZero.isSumZero(numbersFalse));

        ArrayList<Integer> numbersTrue2 = new ArrayList<Integer>();
        numbersTrue2.add(-1);
        numbersTrue2.add(5);
        numbersTrue2.add(83);
        numbersTrue2.add(-5);

        System.out.println(AddToZero.isSumZero(numbersTrue2));

        System.out.println(BinarySearch.myBinarySearch(numbersTrue, 2));

        System.out.println(FindTheRange.findRange(numbersTrue));

        System.out.println(MoreVowels.hasMoreVowels("aeiou"));
        System.out.println(MoreVowels.hasMoreVowels("hell"));
        System.out.println(MoreVowels.hasMoreVowels("hi"));
    }
}
