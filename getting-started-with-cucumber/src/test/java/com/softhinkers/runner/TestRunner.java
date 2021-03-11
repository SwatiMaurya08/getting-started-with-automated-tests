package com.softhinkers.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/20/2020
 */

@RunWith( Cucumber.class )
@CucumberOptions( glue = "com.softhinkers.project_page"  )
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
//tags = "@scenario_1 or @feature_2"
