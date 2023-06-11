package org.example.task3;

import java.util.*;

public class MaximumNumberBalloons {

    public int maxNumberOfBalloons(String text) {
        if (text.length() == 0) {
            System.out.println("line is empty");
        }
        int result = 0;
        int counter = 0;
        Map<Character, Integer> letters = new HashMap<>() {{
            put('b', 0);
            put('a', 0);
            put('l', 0);
            put('o', 0);
            put('n', 0);

        }};

        char[] symbols = text.toCharArray();
        for (char letter : symbols) {
            if (letters.containsKey(letter)) {
                int currentValue = letters.get(letter);
                int newValue = currentValue + 1;
                letters.put(letter, newValue);
            }
        }
        for (char letter : letters.keySet()) {
            if (letter == 'l' || letter == 'o') {
                int currentValue = letters.get(letter);
                int newValue = currentValue / 2;
                letters.put(letter, newValue);
            }
            if (counter == 0 || letters.get(letter) < result) {
                result = letters.get(letter);
                counter++;
            }
        }
        return result;
    }
}