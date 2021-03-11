package com.softhinkers.testngdependents;

import com.softhinkers.testcasespriorities.TestCasesPriorities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngdependents
 * @date 12/3/2020
 */
public class DependsOnGroups {
    public static final Logger LOGGER = LogManager.getLogger(DependsOnGroups.class);

    @Test(dependsOnGroups = {"SignIn"})
    public void ViewAcc() {
        LOGGER.info("SignIn Successful");
    }

    @Test(groups = {"SignIn"})
    public void LogIn() {
        LOGGER.info("Logging In Success");
    }
}
