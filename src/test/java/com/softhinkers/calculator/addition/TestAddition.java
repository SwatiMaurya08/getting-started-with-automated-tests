package com.softhinkers.calculator.addition;

import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    Addition add = new Addition();

    @Test
    public void test_addition_int() {
        int expected_value = 9;
        int actual_value = add.addition(4, 5);
        Assert.assertEquals(expected_value,actual_value);
    }
    @Test
    public void test_addition_float(){
        float expected_value = 9.0f;
        float actual_value = add.addition(4.0f, 5.0f);
        Assert.assertEquals(expected_value,actual_value, 0.0f);
    }
}