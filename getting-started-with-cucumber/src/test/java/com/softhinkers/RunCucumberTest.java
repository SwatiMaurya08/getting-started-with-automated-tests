package com.softhinkers;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 12/21/2020
 */

//From TestNG Runner
@CucumberOptions( glue = "com.softhinkers.project_page" , tags = "@scenario_1 or @feature_2" )
public class RunCucumberTest extends AbstractTestNGCucumberTests{
    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
