package com.softhinkers.testngdependents;

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
    @Test(groups = {"viewacc"})
    public void ViewAcc() {
        System.out.println("View Your Dashboardd");
    }

    @Test(groups = {"openbrowser"})
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }

    @Test(groups = {"login"})
    public void LogIn() {
        System.out.println("Login Into The Account");
    }

    @Test(groups = {"logout"})
    public void CloseAccount() {
        System.out.println("Closing The Account");
    }
}
