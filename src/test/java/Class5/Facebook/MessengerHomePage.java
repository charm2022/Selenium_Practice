package Class5.Facebook;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessengerHomePage {

    By lgginButtonLocator = By.id("loginbutton");

    public void clickLoginButton() {
        UseDriver.getDriver().get("https://www.messenger.com/");
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();
        js.executeScript("scrollBy(0, 500);");
        Misc.sleep(2);
        UseDriver.getDriver().findElement(lgginButtonLocator).click();

    }
}
