package org.example.task2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberGoodPairsTest {
    private static final NumberGoodPairs numberGoodPairs = new NumberGoodPairs();

    @ParameterizedTest(name = "[{index}] good pairs:{1}")
    @MethodSource("source")
    public void numIdenticalPairsTest(int[] nums, int expectedValue) {
        int counter = numberGoodPairs.numIdenticalPairs(nums);
        Assertions.assertEquals(expectedValue, counter);
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 1, 1, 3}, 4),
                arguments(new int[]{1, 1, 1, 1}, 6),
                arguments(new int[]{1, 2, 3}, 0)
        );
    }
}
