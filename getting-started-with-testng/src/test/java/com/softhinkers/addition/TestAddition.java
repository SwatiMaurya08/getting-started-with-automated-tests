package com.softhinkers.addition;

import com.softhinkers.calculator.addition.Addition;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TestCases for Addition
 * */
public class TestAddition {
    private Addition add = new Addition();

    @Test
    public void testAdditionInt() {
        int expectedValue = 10;
        int actualValue = add.addition(5, 5);
        Assert.assertEquals(actualValue, expectedValue,"Your actualValue does not meets expectedValue");
    }

    @Test
    public void testAdditionFloat() {
        float expectedValue = 10.0f;
        float actualValue = add.addition(5.0f, 6.0f);
        Assert.assertEquals(actualValue, expectedValue, "Your actualValue does not meets expectedValue");
    }
}
