package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/6/17.
 */
public class BinarySearch {

    public void BinarySearch() {
        // boa constructor :)
    }

    public static Integer myBinarySearch(ArrayList<Integer> haystack, Integer needle) {
        /* User provides a SORTED list of integers (haystack) and a number to search for (needle)
         * if needle is in haystack, its index is returned. If needle is not in haystack, -1 is returned.
         */

        Integer start = 0;
        Integer end = haystack.size() - 1;

        while (start < end) {
            Integer mid = (start + end) / 2;
            if (needle == haystack.get(mid)) {
                return mid;
            } else if (needle > haystack.get(mid)) {
                start = mid + 1;
            } else if (needle < haystack.get(mid)) {
                end = mid - 1;
            }
        }

        return -1;
    }

}
