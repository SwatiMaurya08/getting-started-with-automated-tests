package com.softhinkers.division;

import com.softhinkers.calculator.division.Division;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.division
 * @date 11/6/2020
 */
public class TestDivision {
    Division div = new Division();

    @Test
    public void TestDivisionInt() {
        int expectedValue = 10;
        int actualValue = div.division(100, 10);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test

    public void TestDivisionFloat() {
        float expectedValue = 10.0f;
        float actualValue = div.division(100f, 10.0f);
        Assert.assertEquals(actualValue, expectedValue);
    }
}
