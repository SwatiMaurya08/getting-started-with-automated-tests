package com.softhinkers.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
