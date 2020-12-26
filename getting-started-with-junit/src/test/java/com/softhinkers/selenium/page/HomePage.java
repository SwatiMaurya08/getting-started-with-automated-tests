package com.softhinkers.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.page
 * @date 12/24/2020
 */
public class HomePage {
    private final String loginButtonCss = "li:nth-child(1) b:nth-child(2)";
    private final String headListXpath = "//a/b";

    @FindBy(css = loginButtonCss)
    WebElement loginButton;

    @FindBy(xpath = headListXpath)
    List<WebElement> headingList;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void clickOnLoginButton() {
        loginButton.click();
    }

    public List<String> getTextFromHeadingList() {
        List<String> headingNameList = new ArrayList<String>();
        for (WebElement headingName : headingList) {
            String heading = headingName.getText();
            headingNameList.add(heading);
        }
        return headingNameList;
    }
}
