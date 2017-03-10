package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by chungnguyen on 3/8/17.
 */
public class MoreVowels {

    // Given a word in English, return True if that word contains
    // more vowels than non-vowels; otherwise, return False.
    public static Boolean hasMoreVowels(String word) {
        Integer total = 0;

        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                total += 1;
            } else {
                total -= 1;
            }
        }

        if (total > 0) {
            return true;
        }

        return false;
    }
}
