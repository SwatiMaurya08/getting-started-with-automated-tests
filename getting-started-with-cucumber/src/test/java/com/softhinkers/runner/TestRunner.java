package com.softhinkers.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/20/2020
 */

@RunWith( Cucumber.class )
@CucumberOptions( glue = "com.softhinkers.project_page" , tags = "@scenario_1 or @feature_2" )
public class TestRunner {

}
