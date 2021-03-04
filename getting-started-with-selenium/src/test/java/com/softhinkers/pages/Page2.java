package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.security.pkcs11.P11Util;

import java.security.PublicKey;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 2/23/2021
 */
public class Page2 {
    public final String regionHeaderXpath = "//div[@class='region-header wd-100 col-md-12 col-xs-12 col-sm-12 padd-0']";
    public final String imageIconXpath = "  (//div[@class='clearfix pos-rel']/div)[1]";
    public final String titlesNavbarXpath = "  //div[@class='col-xs-12 font-18 color-white custom-region-menu-bar']";

    public Page2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = regionHeaderXpath)
    WebElement regionHeader;

    @FindBy(xpath = imageIconXpath)
    WebElement imageIcon;

    @FindBy(xpath = titlesNavbarXpath)
    WebElement titlesNavbar;

    public Boolean getregionHeader() {
        return regionHeader.isDisplayed();
    }

    public Boolean getimageIcon() {
        return imageIcon.isDisplayed();
    }

    public Boolean gettitlesNavbar() {
        return titlesNavbar.isDisplayed();
    }
}
