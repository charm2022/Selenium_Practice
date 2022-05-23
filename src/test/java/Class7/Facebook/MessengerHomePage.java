package Class7.Facebook;

import Helper.Misc;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

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
