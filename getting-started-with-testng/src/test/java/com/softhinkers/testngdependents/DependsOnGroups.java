package com.softhinkers.testngdependents;

import org.testng.annotations.Test;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.testngdependents
 * @date 12/3/2020
 */
public class DependsOnGroups {

    @Test(dependsOnGroups = {"SignIn"})
    public void ViewAcc() {
        System.out.println("SignIn Successful");
    }

    @Test(groups = {"SignIn"})
    public void LogIn() {
        System.out.println("Logging In Success");
    }
}
