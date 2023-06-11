package org.example.task2;

public class NumberGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        if (nums.length == 0) {
            System.out.println("array is empty");
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = 1 + i; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
