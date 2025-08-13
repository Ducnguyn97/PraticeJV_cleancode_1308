package Pratice1;

import Pratice1.src.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    @DisplayName("Testing addition")
    public void testCalculateAddition() {
        int firstOperand = 3;
        int secondOperand = 5;
        char operator = '+';
        int expectedResult = 8;
        int result = Calculator.Calculate(firstOperand, secondOperand, operator);
        assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Testing Subtraction")
    public void testCalculateSubtraction() {
        int firstOperand = 8;
        int secondOperand = 5;
        char operator = '-';
        int expectedResult = 3;
        int result = Calculator.Calculate(firstOperand, secondOperand, operator);
        assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Testing Multiplication")
    public void testCalculateMultiplication() {
        int firstOperand = 8;
        int secondOperand = 5;
        char operator = '*';
        int expectedResult = 40;
        int result = Calculator.Calculate(firstOperand, secondOperand, operator);
        assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Testing Division")
    public void testCalculateDivision() {
        int firstOperand = 8;
        int secondOperand = 4;
        char operator = '/';
        int expectedResult = 2;
        int result = Calculator.Calculate(firstOperand, secondOperand, operator);
        assertEquals(expectedResult, result);
    }
}