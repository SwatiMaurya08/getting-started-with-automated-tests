package com.softhinkers.pages;

import com.softhinkers.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 1/6/2021
 */
public class FooterPage  {

    private final String footerXpath = "//p/b";

    public FooterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = footerXpath)
    WebElement footer;

    public String getFooter(){
      return   footer.getText();
    }
}
