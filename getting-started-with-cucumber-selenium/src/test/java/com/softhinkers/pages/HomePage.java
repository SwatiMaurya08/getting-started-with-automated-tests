package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 1/4/2021
 */
public class HomePage {
    private final String loginButtonCss = "li:nth-child(1) b:nth-child(2)";


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = loginButtonCss)
    WebElement loginButton;

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
