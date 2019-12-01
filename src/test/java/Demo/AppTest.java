package Demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс AppTest для тестирования покупки билета на сайте http://newtours.demoaut.com/
 * @autor - Gorelikov Artem
 * @version - 01.12.2019
 *
 */

public class AppTest {

    @Test
    public void test() {

        //System.setProperty("webdriver.chrome.driver", "D://Install//Selenium//chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //подключение ChromeDriver'a

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);

        driver.get("http://newtours.demoaut.com/"); //переход на сайт http://newtours.demoaut.com/

        //Ожидание поялвения элемента //input[@name='login']
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath (".//input[@name='login']"))));

        /* При работе этого куска тест не будет выплняться, так как на странице нет этого элемента. Будет работать на 3 странице
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath (".//input[@name='reserveFlights']"))));*/

        Page1 page1 = new Page1(eventDriver);
        page1.login("test1", "test1");

        Page2 page2 = new Page2(eventDriver);
        page2.flightFinder();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath
                (".//input[@name='reserveFlights']"))));
        Page3 page3 = new Page3(eventDriver);
        page3.selectFlight();

        Page4 page4 = new Page4(eventDriver);
        page4.bookFlight("Petrov", "Ivan", "Petrova", "Masha",
                "0000 1111 2222");

        driver.close(); //Закрывает браузер
    }
}
