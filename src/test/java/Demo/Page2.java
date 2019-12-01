package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс Page1 для страницы - http://newtours.demoaut.com/mercuryreservation.php
 * @autor - Gorelikov Artem
 * @version - 01.12.2019
 *
 */

public class Page2 {
    WebDriver driver;

    @FindBy(xpath = ".//input [@value='oneway']")
    private WebElement OneWay;

    @FindBy(xpath = ".//option [@value='2']")
    private WebElement Passengers;

    @FindBy(xpath = ".//select [@name='fromPort']/option [@value='London']")
    private WebElement DepartingFrom;

    @FindBy(xpath = ".//select [@name='fromMonth']/option [@value='12']")
    private WebElement OnMonth;

    @FindBy(xpath = ".//select [@name='fromDay']/option [@value='15']")
    private WebElement OnDate;

    @FindBy(xpath = ".//select [@name='toPort']/option [@value='Paris']")
    private WebElement ArrivingIn;

    @FindBy(xpath = ".//select [@name='toMonth']/option [@value='12']")
    private WebElement ReturningMonth;

    @FindBy(xpath = ".//select [@name='toDay']/option [@value='25']")
    private WebElement ReturningDate;

    @FindBy(xpath = ".//input [@value='Coach']")
    private WebElement ServiceClass;

    @FindBy(xpath = ".//select [@name='airline']/option [1]")
    private WebElement Airline;

    @FindBy(xpath = ".//input[@name='findFlights']")
    private WebElement Continue2;


    public Page2(WebDriver driver) {
        this.driver = driver;
    }

    public void flightFinder () {
        PageFactory.initElements(driver, this);
        OneWay.click();
        Passengers.click();
        DepartingFrom.click();
        OnMonth.click();
        OnDate.click();
        ArrivingIn.click();
        ReturningMonth.click();
        ReturningDate.click();
        ServiceClass.click();
        Airline.click();
        Continue2.click();
    }
}

