package com.softhinkers.annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class JunitAnnotation {
    //execute before class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is BeforeClass Annotation");
    }

    //execute after class
    @AfterClass
    public static void afterClass() {
        System.out.println("This is AfterClass Annotation");
    }

    //execute before test
    @Before
    public void before() {
        System.out.println("This is Before Annotation");
    }

    //execute after test
    @After
    public void after() {
        System.out.println("This is After Annotation");
    }

    //test case
    @Test
    public void test() {
        System.out.println("This is Test Annotation");
    }

    //test case ignore and  will  not  execute
    @Ignore
    public void ignoreTest() {
        System.out.println("This is Ignore Annotation");
    }
}
