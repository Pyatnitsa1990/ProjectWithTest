package org.example.task1;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JewelsAndStonesTest {
    private static final JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    @DisplayName("check first operand throw null pointer exception")
    public void checkFirstOperandThrowExceptionFirst() {
        Assertions.assertThrows(NullPointerException.class,
                () -> jewelsAndStones.numJewelsInStones(null, "aAAbbbb"));
    }

    @Test
    @DisplayName("check second operand throw null pointer exception")
    public void checkSecondOperandThrowException() {
        Assertions.assertThrows(NullPointerException.class,
                () -> jewelsAndStones.numJewelsInStones("aA", null));
    }

    @ParameterizedTest(name = "[{index}] String contains {2} jewels ")
    @MethodSource("source")
    public void numJewelsInStonesTest(String jewels, String stones, int expectedValue) {
        int result = jewelsAndStones.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(expectedValue, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                arguments("aA", "aAAbbbb", 3),
                arguments("z", "ZZ", 0)

        );
    }
}
