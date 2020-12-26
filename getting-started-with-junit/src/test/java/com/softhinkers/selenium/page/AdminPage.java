package com.softhinkers.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium
 * @date 12/24/2020
 */
public class AdminPage {

    private final String adminHeaderId = "//*[@id='wrapper']/h1/b";
    private final String adminHomeId = "//*[@id='adminmenu']/li[1]/a/b";

    @FindBy(xpath = adminHeaderId)
    WebElement adminHeader;

    @FindBy(xpath = adminHomeId)
    WebElement AdminHome;

    @FindBy(xpath = "//a/b")
    List<WebElement> HeaderOptions;

    public List<String> getTextFromHeaders() {
        List<String> optionNameList = new ArrayList<String>();
        for (WebElement option : HeaderOptions) {
            String optionName = option.getText();
            optionNameList.add(optionName);
        }
        return optionNameList;
    }


    public String getTextFromAdminHeader() {
        return adminHeader.getText();
    }

    public String getTextFromHome() {
        return AdminHome.getText();
    }

    public String getTextFromAdminHeaderExplicit(WebDriver driver) {
        WebElement adminHeaderExplicit = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf((adminHeader)));
        return adminHeaderExplicit.getText();
    }
}
