package com.softhinkers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 1/5/2021
 */
public class AdvertismentPage {
    private final String advertismentXpath = "(//div[@class = 'well'])[3]";

    public AdvertismentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = advertismentXpath)
    WebElement advertisment;

    public boolean getAdvertisment() {
      return advertisment.isDisplayed();

    }
}
