package com.softhinkers.calculator.division;

import org.junit.Assert;
import org.junit.Test;

public class TestDivision {

    @Test
    public void test_division_int() {
        int expected_value = 5;
        Division div = new Division();
        int actual_value = div.division(10, 2);
        Assert.assertEquals(expected_value, actual_value);
    }
    @Test
    public void test_division_float() {
        float expected_value = 5.0f;
        Division div = new Division();
        float actual_value = div.division(10.0f, 2.0f);
        Assert.assertEquals(expected_value, actual_value,0.0f);
    }


    @Test
    public void test_division_double() {
        double expected_value = 5.0;
        Division div = new Division();
        double actual_value = div.division(10.0, 2.0);
        Assert.assertEquals(expected_value, actual_value,0.0);
    }
}
