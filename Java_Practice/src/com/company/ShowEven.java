package com.company;

import java.util.ArrayList;

/**
 * Created by chungnguyen on 3/10/17.
 */
public class ShowEven {

    public static ArrayList showEven(ArrayList<Integer> numbers) {
        ArrayList<Integer> answers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                answers.add(i);
            }
        }

        return answers;
    }
}
