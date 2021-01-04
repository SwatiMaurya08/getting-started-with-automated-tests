package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 1/4/2021
 */
public class LoginPage {
    private final String inputUsernameEmailId = "inputUsernameEmail";
    private final String inputPasswordId = "inputPassword";
    private final String submitButtonCss = "submit";
    private final String pleaseLoginTextXpath = "//h3";


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, LoginPage.class);
        System.out.println("Inside LoginPage");
    }

    @FindBy(id = inputUsernameEmailId)
    WebElement inputUsernameEmailTextField;

    @FindBy(id = inputPasswordId)
    WebElement inputPasswordIdField;

    @FindBy(name = submitButtonCss)
    WebElement submitButton;

    @FindBy(xpath = pleaseLoginTextXpath)
    WebElement pleaseLoginText;

    public void inputUsername(String username) {
        inputUsernameEmailTextField.click();
        inputUsernameEmailTextField.sendKeys(username);
    }

    public void inputPassword(String password) {
        inputPasswordIdField.click();
        inputPasswordIdField.sendKeys(password);
    }

    public void submitButton() {
        submitButton.click();
    }

    public String getPleaseLoginText() {
        return pleaseLoginText.getText();
    }
}
