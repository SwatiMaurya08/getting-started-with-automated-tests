package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.HomePage;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.test
 * @date 12/24/2020
 */
public class HomeTest extends BaseTest {
    HomePage homePage;

    public HomeTest() {
        homePage = new HomePage(getDriver());
    }


    @Test
    public void verifyHeadingLists() {
        List<String> expectedList = new ArrayList<String>();
        List<String> actualList = new ArrayList<String>();
        expectedList.add("SOFTHINKERS");
        expectedList.add("Home");
        expectedList.add("Projects");
        expectedList.add("Blog");
        expectedList.add("Download");
        expectedList.add("Contact");
        expectedList.add("Login");
        expectedList.add("Register");
        actualList.addAll(homePage.getTextFromHeadingList());
        Assert.assertEquals("Actual Outcome Does not match with Expected", expectedList, actualList);

    }

    @Test
    public void verifyParagraphTitle() {
        String ParagraphHeadingExpected = "WHAT WE DO?";
        String ParagraphHeadingActual = homePage.getTextFromParagraphTitle();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }


    @Test
    public void verifyParagraphHeading() {
        String ParagraphHeadingExpected = "At Softhinkers We Engineer, Conceive Ideas into Reality!";
        String ParagraphHeadingActual = homePage.getTextFromParagraphHeading();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }

    @Test
    public void verifyParagraphSubTitle() {
        String ParagraphHeadingExpected = "WHO WE ARE?";
        String ParagraphHeadingActual = homePage.getTextFromParagraphSubTitle();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }

    @Test
    public void verifyParagraphSubHeading() {
        String ParagraphHeadingExpected = "We are passionate for making our society a better place to live in by-";
        String ParagraphHeadingActual = homePage.getTextFromParagraphSubHeading();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }

    @Test
    public void verifyParagraphContent() {
        String ParagraphHeadingExpected = "Providing cutting-edge techological solutions.";
        String ParagraphHeadingActual = homePage.getTextFromParagraphContent().trim();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }

    @Test
    public void verifyParagraphSubContent() {
        String ParagraphHeadingExpected = "Making you more happy, contended, connected & confident.";
        String ParagraphHeadingActual = homePage.getTextFromParagraphSubContent();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }

    @Test
    public void verifyParagraphSubTittleContent() {
        String ParagraphHeadingExpected = "We are Freelance Freaks, Experts & Renowned Graduates from IIT's, NIT's & Others.";
        String ParagraphHeadingActual = homePage.getTextFromParagraphSubTittleContent();
        Assert.assertEquals("Expected Text does not Match to Actual Text", ParagraphHeadingExpected, ParagraphHeadingActual);
    }
}
