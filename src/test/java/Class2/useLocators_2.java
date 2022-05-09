package Class2;

import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class useLocators_2 {

    @Test
    public void goBackForward(){


    }

    @Test
    public void usingXPath() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String loginEmailXpath = "//input[@aria-label = 'Email or phone number']"; //using //tag[@attrName = 'attrValue']
        By loginEmailLocator = By.xpath(loginEmailXpath);
        WebElement loginEmailBox = driver.findElement(loginEmailLocator);
        loginEmailBox.sendKeys("adeline@gmail.com");

        String loginPassXpath = "//input[@data-testid='royal_pass']"; //using partial atrrValue
        By loginPassLocator = By.xpath(loginPassXpath);
        WebElement loginPassBox = driver.findElement(loginPassLocator);
        loginEmailBox.sendKeys("secret-password");

        String loginButtonXpath = "//button[contains(text() , 'Log')]";
        By loginButtonLocator = By.xpath(loginButtonXpath);
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();


    }
}
