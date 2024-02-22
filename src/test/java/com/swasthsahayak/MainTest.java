package com.swasthsahayak;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void testCalculateSquareRoot() {
        double number = 25;
        double expectedResult = 5;
        double actualResult = Main.calculateSquareRoot(number);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testCalculateFactorial() {
        int number = 5;
        long expectedResult = 120;
        long actualResult = Main.calculateFactorial(number);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateNaturalLog() {
        double number = 10;
        double expectedResult = 2.302585092994046;
        double actualResult = Main.calculateNaturalLog(number);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    // @Test
    // public void testCalculatePower() {
    //     double base = 2;
    //     double exponent = 3;
    //     double expectedResult = 8;
    //     double actualResult = Main.calculatePower(base, exponent);
    //     assertEquals(expectedResult, actualResult, 0.0001);
    // }
}
