package org.hetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    void should_return_3_when_input_is_1_2_plus() {
        // Given
        String[] args = {"1", "2", "+"};

        // When
        int result = calculator.processArgs(args);

        // Then
        assertEquals(3, result);
    }

    @Test
    void should_return_1_when_input_is_2_1_minus() {
        // Given
        String[] args = {"2", "1", "-"};

        // When
        int result = calculator.processArgs(args);

        // Then
        assertEquals(1, result);
    }

    @Test
    void should_return_6_when_input_is_2_3_multiply() {
        // Given
        String[] args = {"2", "3", "*"};

        // When
        int result = calculator.processArgs(args);

        // Then
        assertEquals(6, result);
    }
}