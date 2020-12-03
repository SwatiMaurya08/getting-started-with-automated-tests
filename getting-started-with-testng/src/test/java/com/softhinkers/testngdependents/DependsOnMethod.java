package com.softhinkers.testngdependents;

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
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        System.out.println("This will execute second (SignIn)");
    }

    @Test
    public void OpenBrowser() {
        System.out.println("This will execute first (Open Browser)");
    }
}




