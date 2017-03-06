package com.company;

import java.util.HashMap;

/**
 * Created by chungnguyen on 2/22/17.
 */
public class AnagramPalindrome {
    /* A palindrome is a word that reads the same forward and backwards (eg, “racecar”, “tacocat”).
    An anagram is a rescrambling of a word (eg for “racecar”, you could rescramble this as “arceace”).
    Determine if the given word is a re-scrambling of a palindrome. */

    public AnagramPalindrome() {
        // constructor
    }

    /*public static boolean isAnagramOfPalindrome(String letters) {
        HashMap<String, Integer> map= new HashMap<String, Integer>();

        for (Character letter : letters) {
            if (map.containsKey(letter)) {
                int i = map.get(letter) + 1;
                map.put(letter, i);
            } else {
                map.put(letter, 1);
            }


        }
    }*/
}
