package com.softhinkers.testngdependents;

import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngdependents
 * @date 12/3/2020
 */
public class GroupDependsXml {
    @Test(groups = {"viewaccount"})
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
