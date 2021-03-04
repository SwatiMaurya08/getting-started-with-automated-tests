package com.softhinkers.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.pages
 * @date 2/24/2021
 */
public class Page3 {
    public final String flightsTabXpath = "//div[@class='col-xs-12 padd-0']/ul/li[1]/a";
    public final String cashRadioButtonXpath = "(//input[@type='radio' and @name='booking'])[2]";
    public final String roundTripXpath = "(//div[@class ='col-xs-12 padd-0'])[2]/div/ul/li[1]";
    public final String originXpath = "//*[@id='departsfrom-div']/input[1]";
    public final String selectOriginXpath = "//*[@id='departsfrom-div']/div[3]/p[56]";
    public final String destinationXpath = "//*[@id='arrivesat-div']/input[1]";
    public final String selectDestinationXpath = "//*[@id='arrivesat-div']/div[3]/p[20]";
    public final String departDateid = "departCalendar";
    public final String dateSelectionPopUpXpath = "//div[@class='modal-dialog depart_modal']/div[@class='modal-content']";
    public final String departDateTabid = "departDteTab";
    public final String departDateYearid = "presentYr";
    public final String departDateMonthXpath = "//*[@id='custom_menu']/div[@monthname='May']";
    public final String departDateDayXpath = "(//td[@class=' ui-datepicker-week-end '])[2]";//"//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[@class=' ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-current-day']";
    public final String returnDateTabid = "returnDteTab";
    public final String returnDateYearid = "presentYr";
    public final String returnDateMonthXpath = "//*[@id='custom_menu']/div[@monthname='Jul']";
    public final String returnDateDayXpath = "(//td[@class=' ui-datepicker-week-end '])[7]";//"(//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[@class=' ui-datepicker-week-end  ui-datepicker-current-day'])[1]";
    public final String passengersid = "passengers";
    public final String passengerPopUpXpath = "//div[@class='modal-dialog passenger_modal']/div[@class='modal-content']";
    public final String passengerAdultXpath = "//button[@id = 'adds_adult']";
    public final String travelTypeEconomyXpath = "//button[@class ='eco_btn']";
    public final String doneButtonXpath = "//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']";
    public final String searchFlightButtonid = "book-flight-widget";

    public Page3(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = flightsTabXpath)
    WebElement flightsTab;

    @FindBy(xpath = cashRadioButtonXpath)
    WebElement cashRadioButton;

    @FindBy(xpath = roundTripXpath)
    WebElement roundTrip;

    @FindBy(xpath = originXpath)
    WebElement originName;

    @FindBy(xpath = selectOriginXpath)
    WebElement selectOrigin;

    @FindBy(xpath = destinationXpath)
    WebElement destinationName;

    @FindBy(xpath = selectDestinationXpath)
    WebElement selectDestination;

    @FindBy(id = departDateid)
    WebElement departDate;

    @FindBy(xpath = dateSelectionPopUpXpath)
    WebElement dateSelectionPopUp;

    @FindBy(id = departDateTabid)
    WebElement departDateTab;

    @FindBy(id = departDateYearid)
    WebElement departDateYear;

    @FindBy(xpath = departDateMonthXpath)
    WebElement departDateMonth;

    @FindBy(xpath = departDateDayXpath)
    WebElement departDateDay;

    @FindBy(id = returnDateTabid)
    WebElement returnDateTab;

    @FindBy(id = returnDateYearid)
    WebElement returnDateYear;

    @FindBy(xpath = returnDateMonthXpath)
    WebElement returnDateMonth;

    @FindBy(xpath = returnDateDayXpath)
    WebElement returnDateDay;

    @FindBy(id = passengersid)
    WebElement passenger;

    @FindBy(xpath = passengerPopUpXpath)
    WebElement passengerPopUp;

    @FindBy(xpath = passengerAdultXpath)
    WebElement passengerAdult;

    @FindBy(xpath = travelTypeEconomyXpath)
    WebElement travelTypeEconomy;

    @FindBy(xpath = doneButtonXpath)
    WebElement doneButton;

    @FindBy(id = searchFlightButtonid)
    WebElement searchFlightButton;

    public void getFlightsTab() {
        flightsTab.click();
    }

    public void getcashRadioButton(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(cashRadioButton).click().build().perform();
    }

    public void getRoundTrip() {
        roundTrip.click();
    }

    public void getOrigin(String origin) {
        originName.click();
        originName.sendKeys(origin);
    }

    public void getOriginSelected(WebDriver driver) {
        WebElement originSelectedExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((selectOrigin)));
        originSelectedExplicit.click();

    }

    public void getDestination(String destination) {
        destinationName.click();
        destinationName.sendKeys(destination);
    }

    public void getDestinationSelected(WebDriver driver) {
        WebElement destinationSelectedExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((selectDestination)));
        destinationSelectedExplicit.click();
    }

    public void getDepartDate() {
        departDate.click();
    }

    public Boolean getDateSelectionPopUp(WebDriver driver) {
        WebElement dateSelectionPopUpExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((dateSelectionPopUp)));
        return dateSelectionPopUpExplicit.isDisplayed();
    }

    public Boolean getDepartDateTab() {
        return departDateTab.isDisplayed();
    }

    public void clickDepartDateTab() {
        departDateTab.click();
    }

    public void getDepartDateYear() {
        departDateYear.click();
    }

    public void getDepartDateMonth() {
        departDateMonth.click();
    }

    public void getDepartDateDay() {
        departDateDay.click();
    }

    public void clickReturnDateTab() {
        returnDateTab.click();
    }

    public Boolean getReturnDateTab() {
        return returnDateTab.isDisplayed();
    }

    public void getReturnDateYear() {
        returnDateYear.click();
    }

    public void getReturnDateMonth() {
        returnDateMonth.click();
    }

    public void getReturnDateDay() {
        returnDateDay.click();
    }

    public void getPassenger(WebDriver driver) {
        WebElement passengerExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((passenger)));
        passengerExplicit.click();
    }

    public Boolean getPassengerPopUp(WebDriver driver) {
        WebElement passengerPopUpExplicit = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf((passengerPopUp)));
        return passengerPopUpExplicit.isDisplayed();
    }

    public void getPassengerAdult() {
        passengerAdult.click();
        passengerAdult.click();
    }

    public void getTravelTypeEconomy() {
        travelTypeEconomy.click();
    }

    public void getDoneButton() {
        doneButton.click();
    }

    public void getSearchFlightButton() {
        searchFlightButton.click();
    }

}

