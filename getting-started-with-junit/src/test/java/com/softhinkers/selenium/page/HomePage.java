package com.softhinkers.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(css = loginButtonCss)
    WebElement loginButton;

    @FindBy(xpath = "//a/b")
    List<WebElement> HeadingList;


    public void clickOnLoginButton() {
        loginButton.click();
    }

    public List<String> getTextFromHeadingList() {
        List<String> headingNameList = new ArrayList<String>();
        for (WebElement HeadingName : HeadingList) {
            String heading = HeadingName.getText();
            headingNameList.add(heading);
        }
        return headingNameList;
    }
}
