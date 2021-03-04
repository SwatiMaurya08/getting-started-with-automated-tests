package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 2/24/2021
 */
public class Page4 {

    public final String extraHeadingXpath = "//*[@id='block-system-main']/div[5]/div[2]/div/div[1]/p[3]";
    public final String imageIconXpath = "//*[@id='vistara-exclusives']/div/div/div";
    public final String foldSectionXpath = "//div[@class='overflow-x nav-section']/ul";
    public final String clubVistaraXpath = "  //div[@class='overflow-x nav-section']/ul/li[1]";
    public final String dealsAndOffersXpath = "  //div[@class='overflow-x nav-section']/ul/li[2]";
    public final String destinationsXapth = " //div[@class='overflow-x nav-section']/ul/li[3]";
    public final String mediaCentreXpath = "  //div[@class='overflow-x nav-section']/ul/li[4]";
    public final String vistaraExperienceXpath = "  //div[@class='overflow-x nav-section']/ul/li[5]";


    public Page4(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = extraHeadingXpath)
    WebElement extraHeading;

    @FindBy(xpath = imageIconXpath)
    WebElement imageIcon;

    @FindBy(xpath = foldSectionXpath)
    WebElement foldSection;

    @FindBy(xpath = clubVistaraXpath)
    WebElement clubVistara;

    @FindBy(xpath = dealsAndOffersXpath)
    WebElement dealsAndOffers;

    @FindBy(xpath = destinationsXapth)
    WebElement destinations;

    @FindBy(xpath = mediaCentreXpath)
    WebElement mediaCentre;

    @FindBy(xpath = vistaraExperienceXpath)
    WebElement vistaraExperience;

    public String getExtraHeading() {
        return extraHeading.getText();
    }

    public Boolean getImageIcon() {
        return imageIcon.isDisplayed();
    }

    public Boolean getFoldSection() {
        return foldSection.isDisplayed();
    }

    public String getClubVistara() {
        return clubVistara.getText();
    }

    public String getDealsAndOffers() {
        return dealsAndOffers.getText();
    }

    public String getdestinations() {
        return destinations.getText();
    }

    public String getMediaCentre() {
        return mediaCentre.getText();
    }

    public String getVistaraExperience() {
        return vistaraExperience.getText();
    }


}
