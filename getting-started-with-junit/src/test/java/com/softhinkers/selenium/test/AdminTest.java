package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.AdminPage;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.test
 * @date 12/24/2020
 */
public class AdminTest extends BaseTest {
    AdminPage adminPage;
    LoginPage loginPage;
    HomePage homePage;

    public AdminTest(){
        loginPage = PageFactory.initElements(getDriver(), LoginPage .class);
        adminPage = PageFactory.initElements(getDriver(), AdminPage.class);
    }

    @Test
    public void verifyAdminHeader() {
        String adminHeaderExpected = "Softhinkers Admin Panel";
        String adminHeaderActual = adminPage.getTextFromAdminHeader();
        Assert.assertEquals("Expected admin header title does not matched", adminHeaderExpected, adminHeaderActual);
    }

    @Test
    public void verifyAdminHeaderOptions() {
        List<String> expectedList = new ArrayList<String>();
        List<String> actualList = new ArrayList<String>();
        expectedList.add("Home");
        expectedList.add("About");
        expectedList.add("Projects");
        expectedList.add("Blog");
        expectedList.add("Download");
        expectedList.add("Contact");
        expectedList.add("Users");
        expectedList.add("View Website");
        expectedList.add("Logout");
        actualList.addAll(adminPage.getTextFromHeaders());
        Assert.assertEquals("Text Does not Matched", expectedList, actualList);

    }


}