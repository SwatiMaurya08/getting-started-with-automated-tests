package com.softhinkers.calculator.substraction;

import org.junit.Assert;
import org.junit.Test;

public class TestSubstraction {
    @Test
    public void test_substraction_int() {
        int expected_value = 1;
        Substraction sub = new Substraction();
        int actual_value = sub.substraction(4, 3);
        Assert.assertEquals(expected_value, actual_value);
    }
    @Test
    public void test_substraction_float(){
        float expected_value = - 1.0f;
        Substraction sub = new Substraction();
        float actual_value = sub.substraction(4.0f, 5.0f);
        Assert.assertEquals(expected_value , actual_value , 0.0f);
    }
}
