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

    @Test
    void should_throw_exception_when_input_is_2_3_invalid_operator() {
        // Given
        String[] args = {"2", "3", "/"};

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.processArgs(args));

        // Then
        assertEquals("Invalid operator", exception.getMessage());
    }

    @Test
    void should_throw_exception_when_input_is_2_3_4() {
        // Given
        String[] args = {"2", "3", "4"};

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.processArgs(args));

        // Then
        assertEquals("You must provide 3 arguments: two numbers and an operator (<number> <number> <operator>)", exception.getMessage());
    }

    @Test
    void should_throw_exception_when_input_is_2() {
        // Given
        String[] args = {"2"};

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.processArgs(args));

        // Then
        assertEquals("You must provide 3 arguments: two numbers and an operator (<number> <number> <operator>)", exception.getMessage());
    }
}