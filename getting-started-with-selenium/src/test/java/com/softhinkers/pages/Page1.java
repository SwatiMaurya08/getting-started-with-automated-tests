package com.softhinkers.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 2/22/2021
 */
public class Page1 {
    public final String planTravelXpath = "(//div[@class ='navbar']/div//button/span[@class='subnav-txt'])[1]";
    public final String travelInformationXpath = "(//div[@class ='navbar']/div//button/span[@class='subnav-txt'])[2]";
    public final String clubVistaraXpath = "(//div[@class ='navbar']/div//button/span[@class='subnav-txt'])[3]";
    public final String loginXpath = "(//div[@class ='navbar']/div//button/span[@class='subnav-txt'])[4]";
    public final String enrolXpath = "(//div[@class ='navbar']/div//button/span[@class='subnav-txt'])[5]";
    public final String popUpDoneButtonid = "domain-done";
    public final String closeAndContinueButtonXpath = "//a[@id='att_lightbox_close']";


    public Page1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = planTravelXpath)
    WebElement planTravel;

    @FindBy(xpath = travelInformationXpath)
    WebElement travelInformation;

    @FindBy(xpath = clubVistaraXpath)
    WebElement clubVistara;

    @FindBy(xpath = loginXpath)
    WebElement login;

    @FindBy(xpath = enrolXpath)
    WebElement enrol;

    @FindBy(id = popUpDoneButtonid)
    WebElement popUpDoneButton;

    @FindBy(xpath = closeAndContinueButtonXpath)
    WebElement closeAndContinueButton;

    public String getTextPlanTravel() {
        return planTravel.getText();
    }

    public String getTextTravelInformation() {
        return travelInformation.getText();
    }

    public String getTextClubVistara() {
        return clubVistara.getText();
    }

    public String getTextLogin() {
        return login.getText();
    }

    public String getTextEnrol() {
        return enrol.getText();
    }

    public void getPopUpDoneButton() {
        popUpDoneButton.click();
    }


    public void getCloseAndContinueButton(WebDriver driver){
        WebElement CloseAndContinueButtonExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((closeAndContinueButton)));
        CloseAndContinueButtonExplicit.click();
    }


}


