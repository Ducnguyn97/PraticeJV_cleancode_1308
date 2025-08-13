package Pratice3;

import Pratice3.src.Cylinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CylinderTest {
    @Test
    @DisplayName("Test calculator getVolume(1,2)")
    public void testCalculateBaseVolume() {
        double radius = 1;
        double height = 2;
        double expectedResult = 6.283185307179586;
        double result = Cylinder.volume(radius, height);
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Test calculator getVolume(0,0)")
    public void testCalculateVolume() {
        double radius = 0;
        double height = 0;
        double expectedResult = 0;
        double result = Cylinder.volume(radius, height);
        Assertions.assertEquals(expectedResult, result);
    }
}
