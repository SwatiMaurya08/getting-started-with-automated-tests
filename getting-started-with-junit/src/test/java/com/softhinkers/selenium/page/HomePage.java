package com.softhinkers.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    private final String headListXpath = "//a/b";
    private final String paragraphTitleXpath = "//h2";
    private final String paragraphHeadingXpath = "(//h2)[2]";
    private final String paragraphSubTitleXpath = "(//h2)[3]";
    private final String paragraphSubHeadingXpath = "//h3";
    private final String paragraphContentXpath = "(//h3)[2]";
    private final String paragraphSubContentXpath = "(//h3)[3]";
    private final String paragraphSubTittleContentXpath = "(//h3)[4]";


    @FindBy(css = loginButtonCss)
    WebElement loginButton;

    @FindBy(xpath = headListXpath)
    List<WebElement> headingList;

    @FindBy(xpath = paragraphTitleXpath)
    WebElement paragraphTitle;

    @FindBy(xpath = paragraphHeadingXpath)
    WebElement paragraphHeading;

    @FindBy(xpath = paragraphSubTitleXpath)
    WebElement paragraphSubTitle;

    @FindBy(xpath = paragraphSubHeadingXpath)
    WebElement paragraphSubHeading;

    @FindBy(xpath = paragraphContentXpath)
    WebElement paragraphContent;

    @FindBy(xpath = paragraphSubContentXpath)
    WebElement paragraphSubContent;

    @FindBy(xpath = paragraphSubTittleContentXpath)
    WebElement paragraphSubTittleContent;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickOnLoginButton() {
        loginButton.click();
    }

    public List<String> getTextFromHeadingList() {
        List<String> headingNameList = new ArrayList<String>();
        for (WebElement headingName : headingList) {
            String heading = headingName.getText();
            headingNameList.add(heading);
        }
        return headingNameList;
    }


    public String getTextFromParagraphTitle() {
        return paragraphTitle.getText();
    }

    public String getTextFromParagraphHeading() {
        return paragraphHeading.getText();
    }

    public String getTextFromParagraphSubTitle() {
        return paragraphSubTitle.getText();
    }
    public String getTextFromParagraphSubHeading(){
        return  paragraphSubHeading.getText();
    }

    public String getTextFromParagraphContent() {
        return paragraphContent.getText();
    }

    public String getTextFromParagraphSubContent() {
        return paragraphSubContent.getText();
    }

    public String getTextFromParagraphSubTittleContent() {
        return paragraphSubTittleContent.getText();
    }


}
