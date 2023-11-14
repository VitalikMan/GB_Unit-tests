package Seminars.Seminar3.HomeWork3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    // Тесты для метода evenOddNumber
    @ParameterizedTest
    @ValueSource(ints = {2, 0, -6})
    void evenNumberTrue(int n) {
        assertTrue(MainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 7, -5})
    void oddNumberFalse(int n) {
        assertFalse(MainHW.evenOddNumber(n));
    }


    // Тесты для метода NumberInInterval
    @ParameterizedTest
    @ValueSource(ints = {26, 99})
    void numberInIntervalTrue(int n) {
        assertTrue(MainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 101})
    void numberInIntervalFalse(int n) {
        assertFalse(MainHW.numberInInterval(n));
    }
}