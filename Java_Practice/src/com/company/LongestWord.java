package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/15/17.
 */
public class LongestWord {

    // given a list of words, and return the length of the longest one
    public static Integer lengthOfLongestWord(ArrayList<String> words) {
        Integer wordLength = 0;

        for (String word : words) {
            if (word.length() > wordLength) {
                wordLength = word.length();
            }
        }

        return wordLength;
    }
}
