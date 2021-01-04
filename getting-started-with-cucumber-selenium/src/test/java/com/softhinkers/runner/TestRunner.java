package com.softhinkers.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.runner
 * @date 1/4/2021
 */

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.softhinkers.stepdefinition",features = "src/test/resources/com/softhinkers/feature/")
public class TestRunner {

}
