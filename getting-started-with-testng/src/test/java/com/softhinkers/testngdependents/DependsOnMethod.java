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

/**
 * Using attributes dependsOnMethods in @Test annotations
 */

public class DependsOnMethod {
    public static final Logger LOGGER = LogManager.getLogger(DependsOnMethod.class);
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        LOGGER.info("This will execute second (SignIn)");
    }

    @Test
    public void OpenBrowser() {
        LOGGER.info("This will execute first (Open Browser)");
    }
}




