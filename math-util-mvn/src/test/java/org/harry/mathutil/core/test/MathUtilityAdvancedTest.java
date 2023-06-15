/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.harry.mathutil.core.test;

import static org.harry.mathutil.core.MathUtility.getFactorial; // .*
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Huynh Van Phuot
 */
public class MathUtilityAdvancedTest {

    public static Object[][] initTestData() {
        Object testData[][] = {
            {0, 1},
            {1, 1},
            {2, 2},
            {4, 24},
            {5, 120}
        };
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        Assertions.assertEquals(expected, getFactorial(n));
    }
}
