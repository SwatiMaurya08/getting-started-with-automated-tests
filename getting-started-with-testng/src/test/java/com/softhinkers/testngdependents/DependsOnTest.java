package com.softhinkers.testngdependents;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngdependents
 * @date 12/3/2020
 */
public class DependsOnTest {
    public static final Logger LOGGER = LogManager.getLogger(DependsOnTest.class);

    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        LOGGER.info("User has signed in successfully");
    }

    @Test
    public void OpenBrowser() {
        LOGGER.info("The browser is opened");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void LogOut() {
        LOGGER.info("The user logged out successfully");
    }
}
