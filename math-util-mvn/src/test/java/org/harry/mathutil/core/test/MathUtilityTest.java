/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.harry.mathutil.core.test;

import org.harry.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Huynh Van Phuot
 */
public class MathUtilityTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
//        Assertions.assertEquals(69, 69);
        Assertions.assertEquals(1, MathUtility.getFactorial(0));
        Assertions.assertEquals(1, MathUtility.getFactorial(1));
        Assertions.assertEquals(2, MathUtility.getFactorial(2));
        Assertions.assertEquals(120, MathUtility.getFactorial(5));
    }
}
