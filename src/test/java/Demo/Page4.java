package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс Page1 для страницы - http://newtours.demoaut.com/mercurypurchase.php
 * @autor - Gorelikov Artem
 * @version - 01.12.2019
 *
 */

public class Page4 {
    WebDriver driver;

    @FindBy(xpath = ".//input[@name='passFirst0']")
    private WebElement FirstName1;

    @FindBy(xpath = (".//input[@name='passLast0']"))
    private WebElement LastName1;

    @FindBy(xpath = ".//select [@name='pass.0.meal']/option [@value='DBML']")
    private WebElement Meal1;

    @FindBy(xpath = ".//input[@name='passFirst1']")
    private WebElement FirstName2;

    @FindBy(xpath = (".//input[@name='passLast1']"))
    private WebElement LastName2;

    @FindBy(xpath = ".//select [@name='pass.0.meal']/option [@value='BLML']")
    private WebElement Meal2;

    @FindBy(xpath = ".//input [@name='creditnumber']")
    private WebElement Number;

    @FindBy(xpath = (".//input [@name='buyFlights']"))
    private WebElement SecurePurchase;

    public Page4(WebDriver driver) {
        this.driver = driver;
    }

    public void bookFlight (String firstName1, String lastName1, String firstName2, String lastName2, String number) {
        PageFactory.initElements(driver, this);
        FirstName1.sendKeys(firstName1);
        LastName1.sendKeys(lastName1);
        Meal1.click();
        FirstName2.sendKeys(firstName2);
        LastName2.sendKeys(lastName2);
        Meal2.click();
        Number.sendKeys(number);
        SecurePurchase.click();
    }

}

