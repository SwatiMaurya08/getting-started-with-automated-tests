package com.softhinkers.annotations;

import org.testng.annotations.*;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.annotations
 * @date 12/3/2020
 */
public class TestngAnnotations {
    @Test
    public void testCase1() {
        System.out.println("This is a normal Test Case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute after the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("This will execute before Test Suit");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("This will Execute after Test Suit");
    }
}
