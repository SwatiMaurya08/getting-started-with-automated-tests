package com.softhinkers.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium
 * @date 12/23/2020
 */
public class LoginPage {
    private final String submitButtonCss = "submit";
    private final String inputUsernameEmailId = "inputUsernameEmail";
    private final String inputPasswordId = "inputPassword";


    @FindBy(id = inputUsernameEmailId)
    WebElement inputUsernameEmailTextField;

    @FindBy(id = inputPasswordId)
    WebElement inputPasswordIdField;

    @FindBy(name = submitButtonCss)
    WebElement submitButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void inputUsername(String username) {
        inputUsernameEmailTextField.click();
        inputUsernameEmailTextField.sendKeys(username);
    }

    public void inputPassword(String password) {
        inputPasswordIdField.click();
        inputPasswordIdField.sendKeys(password);
    }
}