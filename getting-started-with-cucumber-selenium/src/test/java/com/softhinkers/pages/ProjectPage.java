package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 1/7/2021
 */
public class ProjectPage {

    private final String projectButtonXpath = "(//a/b)[3]";
    private final String androidButtonXpath = "(//a)[9]";
    private final String phoneSilencerXpath = "//h1/a";
    private final String phoneSilencerHeadingXpath = "//h1/b";
    private final String backToProjectLinkXpath = "//p/a";
    private final String ghostblasterXpath = "(//h1/a)[2]";
    private final String phonesilencerHeadingXpath = "//h1/b";
    private final String minisoccerXpath = "(//h1/a)[3]";
    private final String minisoccerHeadingXpath = "//h1/b";


    public ProjectPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = projectButtonXpath)
    WebElement projectButton;


    @FindBy(xpath = androidButtonXpath)
    WebElement androidButton;

    @FindBy(xpath = phoneSilencerXpath)
    WebElement phoneSilencer;

    @FindBy(xpath = phoneSilencerHeadingXpath)
    WebElement phoneSilencerHeading;

    @FindBy(xpath = backToProjectLinkXpath)
    WebElement backToProjectLink;

    @FindBy(xpath = ghostblasterXpath)
    WebElement ghostblaster;

    @FindBy(xpath = phonesilencerHeadingXpath)
    WebElement phonesilencerHeading;

    @FindBy(xpath = minisoccerXpath)
    WebElement minisoccer;

    @FindBy(xpath = minisoccerHeadingXpath)
    WebElement minisoccerHeading;

    public void getProjectButton() {
        projectButton.click();
    }

    public void getAndroidButton() {
        androidButton.click();
    }

    public void getPhoneSilencerLink() {
        phoneSilencer.click();
    }

    public String getPhoneSilencerHeading() {
        return phoneSilencerHeading.getText();
    }


    public void getbackToProjectLink() {
        backToProjectLink.click();
    }

    public void getghostblasterButton() {
        ghostblaster.click();
    }

    public String getGhostBlasterHeading() {
        return phonesilencerHeading.getText();
    }


    public void getMiniSoccerButton() {
        minisoccer.click();
    }

    public String getMiniSoccerHeading() {
        return minisoccerHeading.getText();

    }

}
