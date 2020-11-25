package com.softhinkers.substraction;

import com.softhinkers.calculator.substraction.Substraction;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.substraction
 * @date 11/6/2020
 */
public class TestSubstraction {
    Substraction sub = new Substraction();

    @Test
    public void TestSubstractionInt() {
        int expectedValue = 90;
        int actualValue = sub.substraction(100, 10);
        Assert.assertEquals(actualValue, expectedValue);
    }


    @Test
    public void TestSubstractionFloat() {
        float expectedValue = 90f;
        float actualValue = sub.substraction(100f, 10f);
        Assert.assertEquals(actualValue, expectedValue);
    }

}


