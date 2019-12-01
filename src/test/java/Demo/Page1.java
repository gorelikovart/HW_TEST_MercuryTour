package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс Page1 для страницы - http://newtours.demoaut.com/
 * @autor - Gorelikov Artem
 * @version - 01.12.2019
 *
 */

public class Page1 {
    WebDriver driver;

    @FindBy(xpath = ".//input[@name='userName']")
    private WebElement loginField;

    @FindBy(xpath = ".//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[@name='login']")
    private WebElement signInField;


    public Page1(WebDriver driver) {
        this.driver = driver;;
    }

    public void login (String login, String password) {
        PageFactory.initElements(driver, this);
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInField.click();
    }

}

