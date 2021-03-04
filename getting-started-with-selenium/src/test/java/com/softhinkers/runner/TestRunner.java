package com.softhinkers.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static com.softhinkers.common.BaseTest.getDriver;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.runner
 * @date 2/22/2021
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.softhinkers.stepdefinition", features = "src/test/resources/feature/")
public class TestRunner {
    @AfterClass
    public static void tearDown() {
        getDriver().close();
        getDriver().quit();
    }
}
