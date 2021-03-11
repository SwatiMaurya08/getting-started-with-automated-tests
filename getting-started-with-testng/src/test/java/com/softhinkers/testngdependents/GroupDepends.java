package com.softhinkers.testngdependents;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngdependents
 * @date 12/3/2020
 * <p>
 * I have created four groups and declared one method in each of them.
 * Notice that there are no dependencies in this file so the file will
 * currently run the methods in the alphabetical order.
 */

public class GroupDepends {
    public static final Logger LOGGER = LogManager.getLogger(GroupDepends.class);
    @Test(groups = {"viewacc"})
    public void ViewAcc() {
        LOGGER.info("View Your Dashboardd");
    }

    @Test(groups = {"openbrowser"})
    public void OpenBrowser() {
        LOGGER.info("Browser Opened Successfully");
    }

    @Test(groups = {"login"})
    public void LogIn() {
        LOGGER.info("Login Into The Account");
    }

    @Test(groups = {"logout"})
    public void CloseAccount() {
        LOGGER.info("Closing The Account");
    }
}
