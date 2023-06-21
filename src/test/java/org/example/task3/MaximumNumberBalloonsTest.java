package org.example.task3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class MaximumNumberBalloonsTest {
    private static final String TWO_BALLOON = "loonbalxballpoon";
    private static final String ONE_BALLOON = "nlaebolko";
    private static final String NONE_BALLOON = "leetcode";

    private static MaximumNumberBalloons maximumNumberBalloons;

    @BeforeAll
    public static void init() {
        maximumNumberBalloons = new MaximumNumberBalloons();
    }

    @ParameterizedTest(name = "[{index}] String contains {1}  balloons")
    @MethodSource("stringSource")
    public void checkString(String value, int expectedValue) {
        int counter = maximumNumberBalloons.maxNumberOfBalloons(value);
        Assertions.assertEquals(expectedValue, counter);
    }

    @Test
    @DisplayName("check throw null pointer exception")
    public void checkThrowException() {
        Assertions.assertThrows(NullPointerException.class,
                () -> maximumNumberBalloons.maxNumberOfBalloons(null));
    }

    private static Stream<Arguments> stringSource() {
        return Stream.of(
                Arguments.arguments(TWO_BALLOON, 2),
                Arguments.arguments(ONE_BALLOON, 1),
                Arguments.arguments(NONE_BALLOON, 0)
        );
    }
}
