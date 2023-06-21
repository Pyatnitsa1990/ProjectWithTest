package org.example.task1;

import java.util.Objects;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length()==0){
            System.out.println("line is empty");
        }
        int counter = 0;
        char[] jewelry = jewels.toCharArray();
        char[] rocks = stones.toCharArray();
        for (char jewel : jewelry) {
            for (char stone : rocks) {
                if (Objects.equals(jewel, stone)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}