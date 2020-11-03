package com.softhinkers.calculator.multiplication;

import com.softhinkers.calculator.substraction.Substraction;
import org.junit.Assert;
import org.junit.Test;

public class TestMultiplication {

    @Test
    public void test_mutiplication_int() {
        int expected_value = 12;
        Multiplication mul = new Multiplication();
        int actual_value = mul.multiplication(4, 3);
        Assert.assertEquals(expected_value, actual_value);
    }

    @Test
    public void test_multiplication_float(){
        float expected_value = 12.0f;
        Multiplication mul = new Multiplication();
        float actual_value = mul.multiplication(4.0f ,3.0f);
        Assert.assertEquals(expected_value, actual_value , 0.0f);
    }
    @Test
    public void test_multiplication_double(){
        double expected_value = 12.0;
        Multiplication mul = new Multiplication();
        double actual_value = mul.multiplication(4.0 ,3.0);
        Assert.assertEquals(expected_value, actual_value , 0.0);
    }
}
