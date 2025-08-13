package Pratice2;

import Pratice2.src.Fizzbuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName ("Test Fizz 3")
    public void testFizz3() {
        int  num = 3;
        String expectedResult = "Fizz";
        String result = Fizzbuzz.FizzBuzz(num);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName ("Test Buzz 5")
    public void testBuzz5() {
        int  num = 5;
        String expectedResult = "Buzz";
        String result = Fizzbuzz.FizzBuzz(num);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Test Fizz Buzz 15")
    public void testFizzBuzz15() {
        int  num = 15;
        String expectedResult = "FizzBuzz";
        String result = Fizzbuzz.FizzBuzz(num);
        Assertions.assertEquals(expectedResult, result);
    }


}
