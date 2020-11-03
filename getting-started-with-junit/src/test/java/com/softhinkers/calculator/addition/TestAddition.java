package com.softhinkers.calculator.addition;

import org.junit.*;

public class TestAddition {
    Addition add = new Addition();

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inside setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Inside tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("Inside setUp");
    }

    @After
    public void tearDown() {
        System.out.println("Inside tearDown");
    }

    @Test
    public void test_addition_int() {
        int expected_value = 9;
        int actual_value = add.addition(4, 5);
        Assert.assertEquals(expected_value, actual_value);
    }

    @Test
    public void test_addition_float() {
        float expected_value = 9.0f;
        float actual_value = add.addition(4.0f, 5.0f);
        Assert.assertEquals(expected_value, actual_value, 0.0f);
    }

    @Test
    public void test_addition_double() {
        double expected_value = 9.0f;
        double actual_value = add.addition(4.0f, 5.0f);
        Assert.assertEquals(expected_value, actual_value, 0.0f);
    }

}