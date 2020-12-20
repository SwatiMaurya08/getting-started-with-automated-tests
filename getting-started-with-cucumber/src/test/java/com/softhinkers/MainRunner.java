package com.softhinkers;

import com.softhinkers.runner.TestRunner;
import io.cucumber.core.cli.Main;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers
 * @date 12/20/2020
 */
public class MainRunner {
    public static void main(String[] args)  {

        // From Junit Runner
        Result result = JUnitCore.runClasses(TestRunner.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

        // From Cucumber Runner
        Main.main("--glue", "com.softhinkers.project_page",
                "--tags", "@feature_2 or @scenario_1"
        );
    }
}
