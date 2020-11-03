package com.softhinkers.executionprocedure;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedureJunit {
    //execute only once, in the starting
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This execute only once in the starting");
    }

    //execute only once, in the end
    @AfterClass
    public static void afterClass() {
        System.out.println("This execute only once in the end");
    }

    //execute for each test, before executing test
    @Before
    public void before() {
        System.out.println("This execute for each test, before executing test");
    }

    //execute for each test, after executing test
    @After
    public void after() {
        System.out.println("This execute for each test, after executing test");
    }

    //test case 1
    @Test
    public void testCase1() {
        System.out.println("This is test case 1");
    }

    //test case 2
    @Test
    public void testCase2() {
        System.out.println("This is test case 2");
    }
}
