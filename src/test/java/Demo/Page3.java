package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс Page1 для страницы - http://newtours.demoaut.com/mercuryreservation2.php
 * @autor - Gorelikov Artem
 * @version - 01.12.2019
 *
 */

public class Page3 {
    WebDriver driver;
    @FindBy(xpath = ".//input [contains(@name, 'outFlight')][contains(@value, 'Pangea')]")
    private WebElement Depart;
    @FindBy(xpath = ("(.//input[contains(@name, 'inFlight')][contains(@value, 'Blue Skies Airlines')])[2]"))
    private WebElement Return;
    @FindBy(xpath = ".//input[@name='reserveFlights']")
    private WebElement Continue3;

    public Page3(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFlight () {
        PageFactory.initElements(driver, this);
        Depart.click();
        Return.click();
        Continue3.click();
    }

}

