package com.softhinkers.multiplication;

import com.softhinkers.calculator.multiplication.Multiplication;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.multiplication
 * @date 11/6/2020
 */
public class TestMultiplication {
    Multiplication mul = new Multiplication();

    @Test
    public void TestMultiplicationInt() {
        int expectedValue = 1000;
        int actualValue = mul.multiplication(100, 10);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void TestMultiplicationFloat() {
        float expectedValue = 1000f;
        float actualValue = mul.multiplication(100f, 10f);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
